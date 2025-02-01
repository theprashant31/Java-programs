import java.util.Scanner;

public class triangle {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = n.nextInt();
		int nst = 1;    //number of stars in one line
		for(int i=1; i<=num;i++) {
			for(int j=1; j<=nst; j++) {
				System.out.print("*");
			}
			nst ++;
			System.out.println();
		}
		n.close();

	}

}
