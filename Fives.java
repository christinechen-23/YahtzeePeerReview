public class Fives extends Score {
    public Fives() {
        super("Fives");
    }
    
    public int calculateScore(int[] values) {
        int sumOfFives = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] == 5) {
                sumOfFives += 5;
            }
        }
        return sumOfFives;
    }
}