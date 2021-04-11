package ultimatefrisbee;

/*
 * Name: Joseph Liang
 * Date: 4/11/21
 * Purpose: Create a class structure using super and subclasses
 */

public class Person {

	private String firstName;
	private String lastName;
	
	public Person(String f, String l) {
		firstName = f;
		lastName = l;
	}
	
	public String toString() {
		return lastName + ", " + firstName;
	}
	
}
