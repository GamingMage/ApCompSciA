package ultimatefrisbee;

public class Coach extends Person {

	//This can be filled with any String, though it would usually be filled by “Head Coach” or “Assistant Coach.”
	private String role;
	
	public Coach(String f, String l, String r) {
		super(f, l);
		role = r;
	}
	
	public String toString() {
		return super.toString() + "\n\tRole: " + role;
	}
	
}
