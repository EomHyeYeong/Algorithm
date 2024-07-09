import java.io.*;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int repeatNumber = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < repeatNumber; i++) {
			String[] n  = br.readLine().split(" ");
			int[] nums = Arrays.stream(n).mapToInt(Integer::parseInt).toArray();
			bw.write((nums[0]+ nums[1]) + "\n");
		}
		
		bw.close();
	}
}