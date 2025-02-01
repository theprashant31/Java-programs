import java.util.Scanner;
public class matrix {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = n.nextInt();
		for(int i=1; i<=num;i++) {
			for(int j=1; j<=num; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		n.close();

	}

}
