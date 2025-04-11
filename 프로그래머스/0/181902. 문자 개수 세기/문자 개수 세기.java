import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        
        char s;
        for(int i=0; i<my_string.length(); i++){
            s = my_string.charAt(i);
            if(Character.isUpperCase(s)){
                answer[s-'A']++;
            } else {
                answer[s-'a'+26]++;
            }
        }
        
        return answer;
    }
}