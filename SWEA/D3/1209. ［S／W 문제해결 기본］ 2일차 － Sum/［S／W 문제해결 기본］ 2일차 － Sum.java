import java.io.*;
import java.util.stream.*;

public class Solution {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int c = 0; c < 10; c++) {
			int tcNumber = Integer.parseInt(br.readLine());
			int[][] numbers = new int[100][];
			for (int i = 0; i < 100; i++) {
				numbers[i] = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			}
			
			int max = 0;
			int rightArrow = 0;
			int leftArrow = 0;
			int[] columnSum = new int[100];
			
			for (int i = 0; i < 100; i++) {
				int rowSum = 0;
				for (int j = 0; j < 100; j++) {
					columnSum[j] += numbers[i][j];
					rowSum += numbers[i][j];
					if (i == j) rightArrow += numbers[i][j];
					if (i+j == 99) leftArrow += numbers[i][j];
				}
				max = Math.max(max, rowSum);
			}
			
			max = Math.max(max, rightArrow);
			max = Math.max(max, leftArrow);
			for (int i = 0; i < 100; i++) max = Math.max(max, columnSum[i]);
			
			System.out.printf("#%d %d\n", c+1, max);
		}
	}
}