package home;
import java.util.Scanner;
public class ArrayRotate {
	public static void main(String[]args) { 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of elements =  ");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("Enter the value of elements =  ");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
//		int[] a = {1,2,3}; 
//  	with using temp variable
//		temp = a[2];
//		a[2] = a[1];
//		a[1] = a[0];
//		a[0] = temp;
//		int n = a.length;
		int temp = a[n-1];
		for(int i = n -1; i > 0; i--) {
			a[i] = a[i - 1];
		}
		a[0] = temp;
		System.out.println("A after swap ");
		for(int i= 0; i < n; i++) {
			System.out.println(a[i]);
		}
		sc.close();	
	}

}
