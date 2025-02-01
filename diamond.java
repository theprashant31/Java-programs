import java.util.Scanner;

public class diamond {
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = n.nextInt();
		int nst = 1;    //number of stars in one line
		int nsp = num/2;    //number of space in one line
//		if(num % 2 != 0) {  Because this pattern is only for odd number only
		for(int i=1; i<=num;i++) {
			for(int j=1; j<=nsp; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=nst; k++) {
				System.out.print("*");
			}
			if(i<=num/2) {
				nst = nst + 2;
				nsp = nsp - 1;
			}
			else {
				nst = nst - 2;
				nsp = nsp + 1;
			}
			System.out.println();
		}
//		}
//		else {
//			System.out.println("Pattern is only for odd number ");
//		}
		n.close();
}
}
