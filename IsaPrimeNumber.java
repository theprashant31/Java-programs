package home;

import java.util.Scanner;

public class IsaPrimeNumber {
	public static void main (String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.println("Enter the number: ");
		 int num = n.nextInt();
		 int count = 0;
		 for (int i = 2; i <= num/2; i++ ) //for (int i = 2; i < num; i++ )
			 {
			 if(num % i == 0) {
				 count ++;
				 System.out.println("Factors are : "+ i);
			 }
		 }
		 if (count == 0) {
				 System.out.println("prime number ");
		 }
		 else {
		 System.out.println("Non prime ");
		 }
		 n.close();
	}

}
