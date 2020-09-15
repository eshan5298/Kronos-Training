package labProjectDay1_Eshan;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		int n;
		System.out.println("Enter the no of rows:");
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		for(int i=0; i<n; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(j+1);
			}
			System.out.println();
		}
		scan.close();
	}

}
