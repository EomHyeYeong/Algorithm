import java.io.*;
import java.util.stream.*;

public class Solution {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int c = 0; c < 10; c++) {
			int dump = Integer.parseInt(br.readLine());
			int[] heights = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			
			while (dump-- > 0) {
				int[] max = getMaxNumber(heights);
				int[] min = getMinNumber(heights);
				heights[max[1]]--;
				heights[min[1]]++;
			}
			int max = getMaxNumber(heights)[0];
			int min = getMinNumber(heights)[0];
			System.out.printf("#%d %d\n", c+1, max-min);
		}
	}
	
	static int[] getMaxNumber(int[] heights) {
		int[] numberInfo = new int[2];
		
		for(int i = 0; i < heights.length; i++) {
			if (numberInfo[0] < heights[i]) {
				numberInfo[0] = heights[i];
				numberInfo[1] = i;
			}
		}
		
		return numberInfo;
	}
	
	static int[] getMinNumber(int[] heights) {
		int[] numberInfo = new int[2];
		numberInfo[0] = 1000;
		
		for(int i = 0; i < heights.length; i++) {
			if (numberInfo[0] > heights[i]) {
				numberInfo[0] = heights[i];
				numberInfo[1] = i;
			}
		}
		
		return numberInfo;
	}
}