package ultimatefrisbee;

public class Captain extends UltimatePlayer {

	//Captains are usually responsible for offense or defense. type is true for offense and false for defense.
	private boolean type;
	
	public Captain(String f, String l, Position p, boolean t) {
		super(f, l, p);
		type = t;
	}
	
	public String toString() {
		String t = "";
		if (type) {
			t = "offense";
		} else {
			t = "defense";
		}
		return super.toString() + "\n\tCaptain: " + t;
	}
	
}
