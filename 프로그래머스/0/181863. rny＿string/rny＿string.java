class Solution {
    public String solution(String rny_string) {
        StringBuilder answer = new StringBuilder();
        int mIndex = -1;
        
        for (int i = 0; i < rny_string.length(); i++) {
            char c = rny_string.charAt(i);
            if (c != 'm') continue;
            answer.append(rny_string.substring(mIndex+1, i));
            answer.append("rn");
            mIndex = i;
        }
        answer.append(rny_string.substring(mIndex+1, rny_string.length()));
        
        return answer.toString();
    }
}