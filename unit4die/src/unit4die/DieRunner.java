package unit4die;

public class DieRunner {
	
	public static void rollOff(Die d6, Die d20) {
		int x, y;
		
		d6.roll();
		d20.roll();
		
		x = d6.getValue();
		y = d20.getValue();
		System.out.println("The first die rolled a " + x);
		System.out.println("The second die rolled a " + y);
		if (x > y) {
			System.out.println(x + " is larger, so die 1 wins the roll-off!");
			return;
		}
		System.out.println(y + " is larger, so die 2 wins the roll-off!");
	}
	public static int compareSides(int x, int y) {
		if (x > y) {
			return x;
		}
		return y;
	}
	
	public static void main(String[] args) {
		Die d6  = new Die();
		Die d20 = new Die(20);
		Die d2  = new Die(2);
		
		System.out.println(d6);
		System.out.println(d20);
		
		rollOff(d6, d20);
		System.out.println("The larger number of sides of the two dice is: " + compareSides(d6.getSides(), d20.getSides()));
		
		for(int i = 1; i <= 30; i++) {
			d20.roll();
			System.out.print(d20.getValue() + " ");
			if (d20.getValue() == 20) {
				System.out.print("Critical Hit! ");
			}
		}
		System.out.println("");
		
		d6.setValue(5);
		System.out.println(d6);

		System.out.println(d2);
		d2.setValue(8);
		System.out.println(d2);

	}

}
