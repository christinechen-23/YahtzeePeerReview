public class Yahtzee extends Score {

    public Yahtzee() {
        super("Yahtzee");
    }

    public int calculateScore(int[] values) {
        int first = values[0];

        for (int v : values) {
            if (v != first) {
                return 0;
            }
        }
        return 50;
    }
}
