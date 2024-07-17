import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] cnts = br.readLine().split(" ");
		
		HashMap<String, String> sites = new HashMap<>();
		for (int i = 0; i < Integer.parseInt(cnts[0]); i++) {
			String[] input = br.readLine().split(" ");
			sites.put(input[0], input[1]);
		}
		
		for (int i = 0; i < Integer.parseInt(cnts[1]); i++) {
			String input = br.readLine();
			String pw = sites.get(input);
			bw.write(pw + "\n");	// 버퍼에 있는 값 전부 출력
		}
		
		bw.flush();				// 남아있는 데이터 모두 출력
		bw.close();				// 스트림 닫기 
	}
}