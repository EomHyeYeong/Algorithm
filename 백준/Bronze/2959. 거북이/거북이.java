import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] list = br.readLine().split(" ");
		Arrays.sort(list);
		
		bw.write(""+Integer.parseInt(list[0]) * Integer.parseInt(list[2]));
		bw.flush();
		bw.close();
	}
}
