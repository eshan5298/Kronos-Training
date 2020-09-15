package labProjectDay1_Eshan;

import java.util.Scanner;

public class CopyOf {

	public static void main(String[] args) {
		System.out.println("Input the size of array:");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println("Enter the elements:");
		int [] a = new int[n];
		for(int i=0; i<n; i++) {
			a[i] = scan.nextInt();
		}
		int[] b = copyOf(a);
		System.out.println("The copied array is:");
		for(int i=0; i<n; i++) {
			System.out.print(b[i]+" ");
		}
		scan.close();
	}

	public static int[] copyOf(int[] a) {
		int n = a.length;
		int[] b = new int[n];
		for(int i=0; i<n; i++) {
			b [i] = a[i];
		}
		return b;
	}

}
