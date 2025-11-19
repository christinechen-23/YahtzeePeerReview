public class Ones extends Score {
    public Ones() {
        super("Ones");
    }
    
    public int calculateScore(int[] values) {
        int sumOfOnes = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] == 1) {
                sumOfOnes += 1;
            }
        }
        return sumOfOnes;
    }
}