import java.util.*;
import java.util.stream.*;

class Solution {
    public String[] solution(String myStr) {
        
        List<String> answer = Arrays.stream(myStr.split("a|b|c", -1))
                .filter(s -> !s.isEmpty()).collect(Collectors.toList());
        if (answer.isEmpty()) answer.add("EMPTY");
        return answer.toArray(String[]::new);
    }
}