import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        Arrays.fill(answer, 0);
        
        char s;
        for(int i=0; i<my_string.length(); i++){
            s = my_string.charAt(i);
            if(Character.isUpperCase(s)){
                answer[s-65]++;
            } else {
                answer[s-97+26]++;
            }
        }
        
        return answer;
    }
}