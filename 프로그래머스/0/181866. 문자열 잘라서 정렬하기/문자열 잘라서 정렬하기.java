import java.util.*;

class Solution {
    public String[] solution(String myString) {
        List<String> splitList = new ArrayList<>(Arrays.asList(myString.split("x")));
        splitList.removeAll(Arrays.asList(""));
        Collections.sort(splitList);
        String[] answer = splitList.toArray(new String[splitList.size()]);
        return answer;
    }
}