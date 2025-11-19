public class Chance extends Score {
    public Chance() {
        super("Chance");
    }
    
    public int calculateScore(int[] values) {
        int total = 0;
        for (int v : values) {
            total += v;
        }
        return total;
    }
}