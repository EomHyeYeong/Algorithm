class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String excMyString = exchangeAandB(myString);
        if (excMyString.contains(pat))
            return 1;
        return answer;
    }
    
    String exchangeAandB(String myString) {
        StringBuilder sb = new StringBuilder();
        for (String c : myString.split("")) {
            if (c.equals("A")) sb.append("B");
            else sb.append("A");
        }
        return sb.toString();
    }
}