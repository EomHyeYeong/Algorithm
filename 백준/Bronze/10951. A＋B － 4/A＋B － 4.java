import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = "";
		
		while((input = br.readLine()) != null) {
			String[] splitStr = input.split(" ");
			int add = Integer.parseInt(splitStr[0]) + Integer.parseInt(splitStr[1]);
			System.out.println(add);
		}
	}
}
