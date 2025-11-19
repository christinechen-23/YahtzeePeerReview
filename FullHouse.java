public class FullHouse extends Score {
    public FullHouse() {
        super("Full House");
    }
    
    public int calculateScore(int[] values) {
        int[] counts = new int[7];

        for (int v : values) {
            counts[v]++;
        }

        boolean hasThree = false;
        boolean hasTwo = false;

        for (int i = 1; i <= 6; i++) {
            if (counts[i] == 3) {
                hasThree = true;
            }
            if (counts[i] == 2) {
                hasTwo = true;
            }
        }

        if (hasThree && hasTwo) {
            return 25;
        }
        return 0;
    }
}