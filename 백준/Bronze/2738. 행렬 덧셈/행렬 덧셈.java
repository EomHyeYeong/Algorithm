import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int row = sc.nextInt();
		int column = sc.nextInt();
		sc.nextLine();
		
		int[][] matrix = new int[row][column];
		int cnt = 0;
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < row; j++) {
				for(int k = 0; k < column; k++) {
					matrix[j][k] += sc.nextInt();
					if(cnt == 1)
						System.out.print(matrix[j][k] + " ");
				}
				if(cnt == 1)
					System.out.println();
			}
			cnt++;
		}
	}
}
