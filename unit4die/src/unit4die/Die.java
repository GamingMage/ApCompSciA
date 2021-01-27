package unit4die;

public class Die {
	private int numSides;
	private int currentValue;
	
	public Die(int sides) {
		setSides(sides);
		roll();
	}
	public Die() {
		this(6);
	}
	
	public void roll() {
		currentValue = (int)(Math.random() * numSides + 1);
	}
	
	public String toString() {
		return "The die has " + numSides + " sides and its current value is " + currentValue + ".";
	}
	
	public int getSides() {
		return numSides;
	}
	public int getValue() {
		return currentValue;
	}
	public void setSides(int n) {
		if (n >= 3) {
			numSides = n;
		}else {
			numSides = 6;
		}
	}
	public void setValue(int n) {
		if (n >= 1 && n <= numSides) {
			currentValue = n;
		}else {
			currentValue = 1;
		}
	}
}
