import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int peopleCnt = Integer.parseInt(br.readLine());
		String[] sizes = br.readLine().split(" ");
		String[] minAmount = br.readLine().split(" ");
		
		int clothOrder = 0;
		int minCloth = Integer.parseInt(minAmount[0]);
		for (String size : sizes) {
			int c_size = Integer.parseInt(size);
			int divide = c_size / minCloth;
			int remain = c_size % minCloth;
			
			if (remain == 0) 
				clothOrder+=divide;
			else if (divide == 0)
				clothOrder += 1;
			else
				clothOrder+=divide+1;
		}
		
		int penDiv = peopleCnt / Integer.parseInt(minAmount[1]);
		int penRem = peopleCnt % Integer.parseInt(minAmount[1]);
		
		System.out.println(clothOrder);
		System.out.println(penDiv + " " + penRem);
	}
}