package home;
import java.util.Scanner;
public class factorial {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = n.nextInt();
		int fact = 1; 
		for(int i=1; i<= num; i++) { 
			fact *= i;               // fact = fact * i;
	}
		System.out.println("the factorial of num is " + fact);
      n.close();
	}
	
	}
		


