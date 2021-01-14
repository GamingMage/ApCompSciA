package recurPairs;

import java.util.Scanner;

/*
 * Name: Joseph Liang
 * Date: 1/13/21
 * Purpose: Make non-iterative, iterative, and recursive versions of a method
 */

public class recurPairs {
	
	public static int factorialIter(int x) {
		int n = 1;
		int y = x;
		for(int i = 0; i < y; i++) {
			n *= x;
			x--;
		}
		return n;
	}
	public static int factorialRecur(int x) {
		if(x == 0) {
			return 1;
		}else {
			return x*factorialRecur(x - 1);
		}
	}
	
	public static int fiboIter(int x) {
		int a = 0;
		int b = 1;
		int c = 0;
		if(x == 0) {
			return 0;
		}else if(x == 1) {
			return 1;
		}
		for(int i = 1; i < x; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		return c;
	}
	public static int fiboRecur(int x) {
		if(x == 0) {
			return 0;
		}else if(x == 1) {
			return 1;
		}else {
			return fiboRecur(x - 1) + fiboRecur(x - 2);
		}
	}
	
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		int x;
		
		System.out.print("Take the iterative factorial of: ");
		x = userInput.nextInt();
		System.out.println(factorialIter(x));
		
		System.out.print("Take the recursive factorial of: ");
		x = userInput.nextInt();
		System.out.println(factorialRecur(x));
		
		//Not working
		System.out.print("Find the fibonachi term iteratively: ");
		x = userInput.nextInt();
		System.out.println(fiboIter(x));
		
		System.out.print("Find the fibonachi term recurssively: ");
		x = userInput.nextInt();
		System.out.println(fiboRecur(x));

	}

}
