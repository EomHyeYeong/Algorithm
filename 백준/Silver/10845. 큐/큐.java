import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int orderCnt = Integer.parseInt(br.readLine());
		
		Deque<String> queue = new LinkedList();
		for (int i = 0; i < orderCnt; i++) {
			String[] order = br.readLine().split(" ");
			switch(order[0]) {
				case "push":
					queue.add(order[1]);
					break;
				case "pop":
					System.out.println(queue.isEmpty()?-1:queue.remove());
					break;
				case "size":
					System.out.println(queue.size());
					break;
				case "empty":
					System.out.println(queue.isEmpty()?1:0);
					break;
				case "front":
					System.out.println(queue.isEmpty()?-1:queue.peek());
					break;
				case "back":
					System.out.println(queue.isEmpty()?-1:queue.peekLast());
					break;
			}
		}
	}
}