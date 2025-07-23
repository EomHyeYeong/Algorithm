class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] strArray = binomial.split(" ");
        switch(strArray[1]) {
            case "+":
                answer = Integer.parseInt(strArray[0]) 
                    + Integer.parseInt(strArray[2]);
                break;
            case "-":
                answer = Integer.parseInt(strArray[0]) 
                    - Integer.parseInt(strArray[2]);
                break;
            case "*":
                answer = Integer.parseInt(strArray[0]) 
                    * Integer.parseInt(strArray[2]);
        }
        return answer;
    }
}