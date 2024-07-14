import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		HashMap<String, Integer> map = new HashMap<>();
		int cardTotalCnt = Integer.parseInt(br.readLine());
		
		String[] cards = br.readLine().split(" ");
		for (String card : cards) {
			if (map.containsKey(card)) {
				int cardCnt = map.get(card);
				map.replace(card, cardCnt+1);
			} else {
				map.put(card, 1);
			}
		}
		
		int resultCnt = Integer.parseInt(br.readLine());
		String[] results = br.readLine().split(" ");
		for (String result : results) {
			if (map.containsKey(result)) {
				bw.write(map.get(result) + " ");
			} else {
				bw.write("0 ");
			}
		}
		bw.flush();
		bw.close();	
	}
}