package home;

import java.util.Scanner;

public class swapThree { 
	public static void main(String[]args) { 
		Scanner n = new Scanner(System.in);
		System.out.println("Enter the numbers: ");
		int a = n.nextInt();
		int b = n.nextInt();
		int c = n.nextInt();
		int temp;
		System.out.println("a before swap " + a );
		System.out.println("b before swap " + b );
		System.out.println("c before swap " + c );
		//with using temp variable;
		temp = b;
		b = a; 
		a = c;
		c = temp;             
		//without using temp variable
//		a = a + b + c;              
//		b = a - (b + c);              
//		c = a - (b + c);             
//		a = a - (b + c);
		System.out.println("a after swap " + a );
		System.out.println("b after swap " + b );
		System.out.println("c after swap " + c );
		n.close();
	}

}
