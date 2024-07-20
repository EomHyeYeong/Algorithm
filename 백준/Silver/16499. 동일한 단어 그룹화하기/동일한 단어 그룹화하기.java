import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashMap<HashMap<String, Integer>, Integer> group = new HashMap<>();
		
		int wordCnt = Integer.parseInt(br.readLine());
		for (int i = 0; i < wordCnt; i++) {
			String input = br.readLine();
			HashMap<String, Integer> inputWord = new HashMap<>();
			for (int j = 0; j < input.length(); j++) {
				String c = String.valueOf(input.charAt(j));
				if (inputWord.containsKey(c)) {
					inputWord.replace(c, inputWord.get(c) + 1);
				} else {
					inputWord.put(c, 1);
					
				}
			}
			if (group.containsKey(inputWord)) {
				group.replace(inputWord, group.get(inputWord) + 1);
			} else {
				group.put(inputWord, 1);
			}			
		}
		System.out.println(group.size());
	}
}