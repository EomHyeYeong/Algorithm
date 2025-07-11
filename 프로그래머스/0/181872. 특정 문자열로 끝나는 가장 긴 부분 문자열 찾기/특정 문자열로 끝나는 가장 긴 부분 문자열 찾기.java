class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        for (int i = 0; i < myString.length() - pat.length()+1; i++) {
            String subs = myString.substring(i, i+pat.length());
            if (subs.equals(pat))
                answer = myString.substring(0, i+pat.length());
        }
        return answer;
    }
}