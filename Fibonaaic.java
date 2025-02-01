package home;
import java.util.Scanner;
public class Fibonaaic {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = n.nextInt();
		int first = 0, second = 1;
		System.out.println(first);
		System.out.println(second);
		for(int i=3; i<=num; i++) {
			int result = first + second;
			first = second;
			second = result;
			System.out.println(result);
		}
n.close();
	}

}
