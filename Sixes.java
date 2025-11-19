public class Sixes extends Score {
    public Sixes() {
        super("Sixes");
    }
    
    public int calculateScore(int[] values) {
        int sumOfSixes = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] == 6) {
                sumOfSixes += 6;
            }
        }
        return sumOfSixes;
    }
}