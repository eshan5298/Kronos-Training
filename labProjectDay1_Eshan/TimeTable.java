package labProjectDay1_Eshan;

public class TimeTable {

	public static void main(String[] args) {
		int[][] a = new int[9][9];
		for(int i=0; i<9; i++) {
			a[0][i] = i+1;
			a[i][0] = i+1;
		}
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				a[i][j] = (i + 1) * (j + 1);
			}
		}
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

}
