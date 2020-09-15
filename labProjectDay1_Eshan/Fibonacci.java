package labProjectDay1_Eshan;

public class Fibonacci {

	public static void main(String[] args) {
		int temp1 = 1, temp2 = 1;
		float sum =2;
		System.out.print(temp1+" "+temp2+" ");
		for(int i=0; i<18; i++) {
			System.out.print(temp1+temp2+" ");
			sum+=temp1+temp2;
			int temp = temp2;
			temp2 = temp1 + temp2;
			temp1 = temp;
		}
		System.out.println();
		System.out.println("avg:"+sum/20);
	}

}
