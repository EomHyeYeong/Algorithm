class Solution {
    public int[] solution(String myString) {
        String[] strArray = myString.split("x");
        int aLength = strArray.length;
        if (myString.charAt(myString.length()-1) == 'x')
            aLength++;
        int[] answer = new int[aLength];
        
        for (int i = 0; i < strArray.length; i++) {
            answer[i] = strArray[i].length();
        }

        return answer;
    }
}