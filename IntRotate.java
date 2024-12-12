package home;
import java.util.Scanner;
public class IntRotate {
// Reversing a number
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = n.nextInt();
        System.out.println("Digits from right to left:");
        while (num != 0) //while( num > 0) 
        {
            int digit = num % 10;                               
            System.out.println(digit);
            num = num / 10;
            
        }
        n.close();
	}

}
