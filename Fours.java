public class Fours extends Score {
    public Fours() {
        super("Fours");
    }
    
    public int calculateScore(int[] values) {
        int sumOfFours = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] == 4) {
                sumOfFours += 4;
            }
        }
        return sumOfFours;
    }
}