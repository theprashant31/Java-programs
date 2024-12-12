package home;
import java.util.Scanner;
public class FactorsOfNum {
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		 int num = n.nextInt();
		 for (int i = 1; i <= num; i++ ) {
			 if(num % i == 0) {
				 System.out.println("Factors are: " + i);
			 }
		 }
		 n.close();
	}
}
