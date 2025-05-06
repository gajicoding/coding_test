class Solution {
    public int solution(String s) {
        String[] word = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String answer = s;
        
        for(int i=0; i<word.length; i++){
            answer = answer.replace(word[i], i+"");
        }
        
        return Integer.parseInt(answer);
    }
}