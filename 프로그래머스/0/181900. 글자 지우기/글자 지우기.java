class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = my_string;
        for(int i: indices){
            answer = answer.substring(0, i) + " " + answer.substring(i+1); 
        }
        return answer.replaceAll(" ",  "");
    }
}