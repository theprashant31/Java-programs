
import java.util.Scanner;
public class EvenOdd {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = n.nextInt();
		if(num % 2 == 0) {
			System.out.println("Number is Even");
		}
		else {
			System.out.println("Number is odd");
		}
		n.close();
	}

}
