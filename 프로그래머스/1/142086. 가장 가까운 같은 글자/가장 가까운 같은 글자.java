import java.util.*;

class Solution {
    public int[] solution(String s) {
        Map<Character, Integer> posMap = new HashMap<>();
        int[] answer = new int[s.length()];
        
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            answer[i] = posMap.containsKey(c) ? i - posMap.get(c) : -1;
            posMap.put(c, i);
        }
        
        return answer;
    }
}