package home;

import java.util.Scanner;

public class swapTwo {  
	public static void main(String[]args) { 
		Scanner n = new Scanner(System.in);
		System.out.println("Enter the numbers: ");
		int a = n.nextInt();
		int b = n.nextInt();
		int temp;
		System.out.println("a before swap " + a );
		System.out.println("b before swap " + b );
//		//with using temp variable
		temp = a;
		a = b;
		b = temp;
//		//without using temp variable
//		a = a + b;              
//		b = a - b;              
//		a = a- b;
		System.out.println("a after swap " + a );
		System.out.println("b after swap " + b );	
		n.close();
	}

}
