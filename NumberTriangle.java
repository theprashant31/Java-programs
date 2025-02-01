import java.util.Scanner;

public class NumberTriangle {
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = n.nextInt();
		int nst = 1;
		int val = 1;//number of stars in one line
		for(int i=1; i<=num;i++) {
			for(int j=1; j<=nst; j++) {
				System.out.print(val + " ");
				val++;
			}
			nst ++;
			System.out.println();
		}
		n.close();
	}
}
