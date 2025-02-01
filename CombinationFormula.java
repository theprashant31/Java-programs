package home;

import java.util.Scanner;

public class CombinationFormula {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.print("Enter  value of n : ");
		int num = n.nextInt();
		System.out.print("Enter  value of r : ");
		int rem = n.nextInt();
		int nfact = 1; 
		for(int i=1; i<= num; i++) { //this will give n factorial
			nfact *= i;               // nfact = nfact * i;
	}
		int rfact = 1; 
		for(int j=1; j<= rem; j++) { //this will give r factorial
			rfact *= j;               // rfact = rfact * i;
	}
		int nrfact = 1; 
		for(int k=1; k<= num - rem; k++) { //this will give n - r factorial
			nrfact *= k;               // nrfact = nrfact * i;
	}
		int result = nfact/(rfact * nrfact);
		System.out.println("the combination of num is " + result);
      n.close();
	}

}
