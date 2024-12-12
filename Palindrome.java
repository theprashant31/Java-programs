package home;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = n.nextInt();
		int temp = num;
		int reverse = 0;
		while (temp != 0) //while( num > 0) 
        {          
			int digit = temp % 10;
            reverse = (reverse * 10) + digit;
            temp = temp / 10;       
        }
        n.close();
        System.out.println("Reverse Number: " + reverse);
        if (num == reverse)     //{} is not compulsory in case of only one operation
        	System.out.println("Number is palindrome");
        
        else 
        	System.out.println("Number is not palindrome");
	}
}
