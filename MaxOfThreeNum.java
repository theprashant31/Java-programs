

import java.util.Scanner;

public class MaxOfThreeNum {
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.println("Enter the numbers: ");
		int a = n.nextInt();
		int b = n.nextInt();
		int c = n.nextInt();
		if(a >= b && a >= c) {
			System.out.println("A is greater");
		}
		else if(b >= a && b >= c) {
			System.out.println("B is greater");
		}
		else {
			System.out.println("C is greater");
		}
		n.close();
	}

}
