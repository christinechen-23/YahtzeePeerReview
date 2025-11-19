public class Threes extends Score {
    public Threes() {
        super("Threes");
    }
    
    public int calculateScore(int[] values) {
        int sumOfThrees = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] == 3) {
                sumOfThrees += 3;
            }
        }
        return sumOfThrees;
    }
}