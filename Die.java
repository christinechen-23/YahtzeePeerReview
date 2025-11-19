public class Die {
	private int numSides;
	private int dieValue;
	
	public Die() {
		numSides = 6;
		roll();
	}
	
	public Die(int numSides) {
		this.numSides = numSides;
		roll();
	}
	public Die(int numSides, int dieValue) {
		this.numSides = numSides;
		this.dieValue = dieValue;
	}
	
	public void roll() {
		dieValue = (int) (Math.random() * numSides) + 1;
	}
	
	/**
	 * @return the numSides
	 */
	public int getNumSides() {
		return numSides;
	}
	/**
	 * @param numSides the numSides to set
	 */
	public void setNumSides(int numSides) {
		this.numSides = numSides;
	}
	/**
	 * @return the dieValue
	 */
	public int getDieValue() {
		return dieValue;
	}
	/**
	 * @param dieValue the dieValue to set
	 */
	public void setDieValue(int dieValue) {
		this.dieValue = dieValue;
	}
	
	public String toString() {
		return "# Sides: " + numSides + " Die Value = " + dieValue;
	}
}
