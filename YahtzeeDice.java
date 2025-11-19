public class YahtzeeDice {

	public static final int NUM_OF_DICE = 5; 

	private Die[] dice; 

	public YahtzeeDice() {  
		dice = new Die[NUM_OF_DICE];
		for (int i = 0; i < NUM_OF_DICE; i++) {
			dice[i] = new Die();
		}
	}

	public YahtzeeDice(int numSides) {
		dice = new Die[NUM_OF_DICE];
		for(int i = 0; i < NUM_OF_DICE; i++) {
			dice[i] = new Die(numSides); 
		}
	}

	public static void main(String[] args) {

		YahtzeeDice sixSidedQuintetOfDice = new YahtzeeDice();
		YahtzeeDice twelveSidedQuintetOfDice = new YahtzeeDice(12);

		System.out.println("Test rolling of default yahtzee dice: " + sixSidedQuintetOfDice.roll());
		System.out.println("Test .toString() of default yahtzee dice: " + sixSidedQuintetOfDice);
		System.out.println("Test getDiceValues of default yahtzee dice: ");
		for(int i = 0; i < 5; i++) {
			System.out.print(sixSidedQuintetOfDice.getDiceValues()[i] + ", ");
		}

		System.out.println("Test rolling of 12-sided yahtzee dice: " + twelveSidedQuintetOfDice.roll());
		System.out.println("Test .toString() of 12-sided yahtzee dice: " + twelveSidedQuintetOfDice);
		System.out.println("Test getDiceValues of 12-sided yahtzee dice: ");
		for(int i = 0; i < 5; i++) {
			System.out.print(twelveSidedQuintetOfDice.getDiceValues()[i] + ", ");
		}


	}

	public int roll() {
		int sum = 0;
		
		for (int i = 0; i < dice.length; i++) {
			dice[i].roll();
			sum += dice[i].getDieValue();
		}
		return sum;
	}

    public int roll(boolean[] holdArray) {
		int sum = 0;
		
		for (int i = 0; i < dice.length; i++) {
            if (!holdArray[i]) {
                dice[i].roll();
            }
			sum += dice[i].getDieValue();
		}
		return sum;
	}

	public Die[] getDice() {  
		return dice;
	}

	public int[] getDiceValues() {  
		int[] diceValues = new int[NUM_OF_DICE];
		for(int i = 0; i < dice.length; i++) {
			diceValues[i] = dice[i].getDieValue();
		}
		return diceValues;
	}

	public String toString() {
		String yahtzee = "The " + NUM_OF_DICE + " dice read: ";

		for(int i = 0; i < dice.length; i++) {
			if(i < dice.length - 1)	
				yahtzee += dice[i].getDieValue() + ", ";
			else
				yahtzee += dice[i].getDieValue() + ".";
		}
		return yahtzee;
	}

}