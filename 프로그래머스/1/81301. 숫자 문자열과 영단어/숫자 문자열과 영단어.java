import java.util.*;

class Solution {
    public int solution(String s) {
        HashMap<String, Integer> wordMap = setWordMap();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length(); i++) {
            if(Character.isDigit(s.charAt(i))) {
                sb.append(s.charAt(i));
                continue;
            }

            for(String number : wordMap.keySet()) {
                if(s.substring(i).startsWith(number)) {
                    sb.append(wordMap.get(number));
                    break;
                }
            }
        }
        return Integer.parseInt(sb.toString());
    }
    
    HashMap<String, Integer> setWordMap() {
        HashMap<String, Integer> wordMap = new HashMap<>();
        wordMap.put("zero", 0);
        wordMap.put("one", 1);
        wordMap.put("two", 2);
        wordMap.put("three", 3);
        wordMap.put("four", 4);
        wordMap.put("five", 5);
        wordMap.put("six", 6);
        wordMap.put("seven", 7);
        wordMap.put("eight", 8);
        wordMap.put("nine", 9);
        return wordMap;
    }
}