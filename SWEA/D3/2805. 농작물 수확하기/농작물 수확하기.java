import java.io.*;

public class Solution {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		
		for (int c = 0; c < testCase; c++) {
			int n = Integer.parseInt(br.readLine());
			String[] farm = new String[n];
			for (int i = 0; i < n; i++)
				farm[i] = br.readLine();
			
			int vertex = (n-1) / 2;
			int start = vertex;
			int revenue = 0;
			int len = 1;
			
			for (int i = 0; i < n; i++) {
				for (int j = start; j < start+len; j++) {
					revenue += Character.digit(farm[i].charAt(j), 10);
				}
				start = adjustStartPoint(i, vertex, start);
				len = adjustLength(i, vertex, len);
			}
			System.out.printf("#%d %d\n", c+1, revenue);
		}

	}
	
	static int adjustStartPoint(int idx, int vertex, int start) {
		return (idx < vertex) ? --start : ++start;
	}
	
	static int adjustLength(int idx, int vertex, int len) {
		return (idx < vertex) ? len+2 : len-2;
	}
}