package ultimatefrisbee;

public class UltimatePlayer extends Person {

	private int jerseyNumber;
	private static int playerCount = 0;
	
	private Position position;
	
	public UltimatePlayer(String f, String l, Position p) {
		super(f, l);
		playerCount++;
		jerseyNumber = playerCount;
		position = p;
	}
	
	public Position getPosition() {
		return position;
	}
	
	public String toString() {
		return super.toString() + "\n\tJersey #: " + jerseyNumber + "\n\tPosition: " + position;
	}
	
}
