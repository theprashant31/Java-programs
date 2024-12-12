

import java.util.Scanner;

public class DivisibleTwoThree {
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = n.nextInt();
		if(num % 2 ==0 && num % 3 == 0)      // number is divided by 3 and 2
		//if(num % 2 ==0 || num % 3 == 0) number is divided by 3 or 2
			{
			System.out.println("Number is Divided by 2 or 3");
		}
		else {
			System.out.println("Number is not divided by 2 or 3");
		}
		n.close();

	}

}
