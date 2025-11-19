public class LargeStraight extends Score {
    public LargeStraight() {
        super("Large Straight");
    }
    
    public int calculateScore(int[] values) {
        boolean[] exists = new boolean[7];

        for (int v : values) {
            exists[v] = true;
        }

        if (exists[1] && exists[2] && exists[3] && exists[4] && exists[5] ||
            exists[2] && exists[3] && exists[4] && exists[5] && exists[6]) {
            return 40;
        }
        return 0;
    }
}