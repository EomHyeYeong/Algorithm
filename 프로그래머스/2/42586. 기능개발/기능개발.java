import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        boolean[] deploy = new boolean[progresses.length];
        int deployPointer = 0;
        List<Integer> answer = new ArrayList<>();
        
        while (true) {
            for (int i = 0; i < progresses.length; i++) {
                progresses[i] += speeds[i];
                if (progresses[i] >= 100) 
                    deploy[i] = true;
            }
            
            int deployCounter = 0;
            while (deployPointer < progresses.length) {
                if (deploy[deployPointer] == false) break;
                deployPointer++;
                deployCounter++;
            }
            if (deployCounter > 0) answer.add(deployCounter);
            
            int total = answer.stream().mapToInt(Integer::intValue).sum();
            if (total == progresses.length) break;
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}