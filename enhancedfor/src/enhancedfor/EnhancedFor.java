package enhancedfor;

public class EnhancedFor {

	public static void main(String[] args) {
		String[] operators = {"Add", "Subtract", "Multiply", "Divide"};
		
		for (String o: operators) {
			System.out.println(o.length() + "\t" + o.toUpperCase() + "\t" + o.charAt(0) + "\t" + o.charAt(o.length() - 1));
		}

	}

}
