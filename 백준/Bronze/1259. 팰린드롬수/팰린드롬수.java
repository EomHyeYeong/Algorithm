import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb;
		String reverse;
		String str = "";
		
		while (true) {
			str = br.readLine();
			if(str.equals("0")) break;
			
			sb = new StringBuffer(str);
			reverse = sb.reverse().toString();
			
			if(str.equals(reverse)) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
	}
}
