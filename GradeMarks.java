

import java.util.Scanner;

public class GradeMarks {
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int marks = n.nextInt();
		if(marks > 90) {
			System.out.println("Grade is Excellent");
		}
		else if(marks <=90 && marks > 80) {
			System.out.println("Grade is Good");
		}
		else if(marks <=80 && marks > 70) {
			System.out.println("Grade is Avg");
		}
		else if(marks <=70 && marks > 60) {
			System.out.println("Grade is Below Avg");
		}
		else {
			System.out.println("Grade is Poor");
		}
		n.close();
	}

}
