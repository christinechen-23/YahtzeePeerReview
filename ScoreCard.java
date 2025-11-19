public class ScoreCard {
    private Score[] scores;

    public ScoreCard() {
        scores = new Score[14];

        scores[1] = new Ones();
        scores[2] = new Twos();
        scores[3] = new Threes();
        scores[4] = new Fours();
        scores[5] = new Fives();
        scores[6] = new Sixes();
        scores[7] = new ThreeOfAKind();
        scores[8] = new FourOfAKind();
        scores[9] = new FullHouse();
        scores[10] = new SmallStraight();
        scores[11] = new LargeStraight();
        scores[12] = new Chance();
        scores[13] = new Yahtzee();
    }

    public String getScores() {
        String str = "";
        for (int i = 1; i < 14; i++) {
            str += String.format("%-6s%-25s%-5d", "[" + i + "] ", scores[i].getName() + ": ", scores[i].getValue());
            if (i % 3 == 2) {
                str += "\n";
            }
        }
        return str;
    }
    public boolean isFull() {
        for (int i = 1; i < 14; i++) {
            if (scores[i].getValue() == -1) {
                return false;
            }
        }
        return true;
    }

    public boolean isAvailable(int index) {
        return scores[index].getValue() == -1;
    }

    public void assignScore(int index, int[] dice) {
        int value = scores[index].calculateScore(dice);
        scores[index].setValue(value);
    }

    public int getTotalScore() {
        int total = 0;
        for (int i = 1; i < 14; i++) {
            total += scores[i].getValue();
        }
        return total;
    }
}