
import java.util.Scanner;
public class PrimeNumberinRange {
	public static void main (String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.println("Enter the number: ");
		 int num = n.nextInt();
		 for (int j = 1; j <= num; j++) {
			 int count = 0;
			 if(j==1) {
				 continue;
			 }
		 for (int i = 2; i <= j/2; i++ ) //for (int i = 2; i < num; i++ )
		 {
			 if(j % i == 0) {
				 count ++;
				 //System.out.println(i);
			 }
		 }
		 if (count == 0) {
				 System.out.println(j);
		 }
		 
		 }
		 n.close(); 
	}

}
