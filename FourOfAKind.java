public class FourOfAKind extends Score {
    public FourOfAKind() {
        super("Four of a Kind");
    }
    
    public int calculateScore(int[] values) {
        int[] counts = new int[7];

        for (int v : values) {
            counts[v]++;
        }

        for (int i = 1; i <= 6; i++) {
            if (counts[i] >= 4) {
                int total = 0;
                for (int v : values) {
                    total += v;
                }
                return total;
            }
        }

        return 0;
    }
}