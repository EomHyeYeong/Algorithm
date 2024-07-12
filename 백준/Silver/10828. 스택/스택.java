import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int orderCnt = Integer.parseInt(br.readLine());
		List<String> stack = new ArrayList<>();
		
		for (int i = 0; i < orderCnt; i++) {
			String[] inputList = br.readLine().split(" ");
			
			String answer;
			switch(inputList[0]) {
				case "push":
					stack.add(inputList[1]);
					break;
				case "pop":
					System.out.println(stack.isEmpty()?-1:stack.remove(stack.size()-1));
					break;
				case "size":
					System.out.println(stack.size());
					break;
				case "empty":
					System.out.println(stack.isEmpty()?1:0);
					break;
				case "top":
					System.out.println(stack.isEmpty()?-1:stack.get(stack.size()-1));
					break;
			}
		}
	}
}