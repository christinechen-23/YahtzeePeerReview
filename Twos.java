public class Twos extends Score {
    public Twos() {
        super("Twos");
    }
    
    public int calculateScore(int[] values) {
        int sumOfTwos = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] == 2) {
                sumOfTwos += 2;
            }
        }
        return sumOfTwos;
    }
}