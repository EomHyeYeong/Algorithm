class Solution {
    public String solution(String myString) {
        String answer = "";
        String curr;
        
        for (int i = 0; i < myString.length(); i++) {
            curr = Character.toString(myString.charAt(i));
            
            if (curr.equals("a") || curr.equals("A")) {
                answer += curr.toUpperCase();
                continue;
            } 
            answer += curr.toLowerCase();
        }
        return answer;
    }
}