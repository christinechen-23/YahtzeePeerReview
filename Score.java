public abstract class Score {
    private String name;
    private int value;
    private boolean isUsed;

    public Score(String name) {
        this.name = name;
        this.value = -1;
        this.isUsed = false;
    }

    public String getName() {
        return this.name;
    }
    public int getValue() {
        return this.value;
    }
    public void setValue(int newValue) {
        this.value = newValue;
    }
    public abstract int calculateScore(int[] values);
}