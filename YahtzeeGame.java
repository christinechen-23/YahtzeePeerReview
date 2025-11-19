import java.util.Scanner;
import java.util.Arrays;

public class YahtzeeGame {
	private YahtzeeDice gameDice;
    private ScoreCard scoreCard;

	public YahtzeeGame() {
		gameDice = new YahtzeeDice();
        scoreCard = new ScoreCard();
	}
    
	public void startGame() {
		System.out.println("***Starting Game***");
		System.out.println("You have a max of 3 turns per round.");
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        
        while (!scoreCard.isFull()) {
            String userInput;
            int turns = 3;
            boolean[] holdArray = new boolean[5];

            do {
                System.out.println("Rolling...");
                gameDice.roll(holdArray);
                System.out.println(gameDice.toString());
                turns--;
                
                if (turns > 0) {
                    System.out.println("(" + turns + ") turns left in this round.");
                    System.out.print("Would you like to roll again? (y) for yes, (n) for no: ");
                    userInput = scanner.nextLine();
                    while (!userInput.equals("y") && !userInput.equals("n")) {
                        System.out.print("Invalid input. Please enter (y) for yes, (n) for no: ");
                        userInput = scanner.nextLine();
                    }

                    if (userInput.equals("y")) {
                        for (int punj = 1; punj <= 5; punj++) {
                            System.out.print("Hold die #" + punj + "? (y or n): ");
                            String holdDie = scanner.nextLine();
                            while (!holdDie.equals("y") && !holdDie.equals("n")) {
                                System.out.print("Invalid input. Please enter (y) to hold, (n) to not hold: ");
                                holdDie = scanner.nextLine();
                            }
                            holdArray[punj - 1] = (holdDie.equals("y"));
                        }
                    }
                } else {
                    userInput = "n";
                }
                    
            } while (userInput.equals("y"));
            System.out.println();

            System.out.println("Current Score Card (-1 means blank):");
            System.out.println(scoreCard.getScores());
            System.out.println(gameDice.toString());
            System.out.println();

            int choice = -1;
            while (true) {
                System.out.print("Choose a category number to place your dice rolls in (1-13): ");

                if (!scanner.hasNextInt()) {
                    System.out.println("Invalid input. Please enter a number between 1 and 13.");
                    scanner.nextLine();
                    continue;
                }

                choice = scanner.nextInt();
                scanner.nextLine();

                if (choice < 1 || choice > 13) {
                    System.out.println("Number must be between 1 and 13.");
                    continue;
                }

                if (!scoreCard.isAvailable(choice)) {
                    System.out.println("That category is already used. Pick another.");
                    continue;
                }

                break;
            }
            
            scoreCard.assignScore(choice, gameDice.getDiceValues());

            System.out.println();
            System.out.println("Updated Score Card: ");
            System.out.println(scoreCard.getScores());
            System.out.println();
        }
        System.out.println();
        System.out.println("Thanks for playing! Your final score was: " + scoreCard.getTotalScore());
	}
} 