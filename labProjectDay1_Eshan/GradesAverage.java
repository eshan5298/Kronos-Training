package labProjectDay1_Eshan;

import java.util.Scanner;

public class GradesAverage {

	public static void main(String[] args) {
		System.out.println("Enter the no of students:");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int [] a = new int[n];
		for(int i=0; i<n; i++) {
			System.out.println("Input score of the student no." + i + ":");
			a[i]=scan.nextInt();
			while(a[i]<0||a[i]>100) {
				System.out.println("Input btw 0 & 100");
				System.out.println("Input score of the student no." + i + ":");
				a[i]=scan.nextInt();
			}
		}
		int sum=0;
		for(int i=0; i<n; i++) {
			sum = sum + a[i];
		}
		System.out.println("The avg is " + sum/n);
		scan.close();
	}

}
