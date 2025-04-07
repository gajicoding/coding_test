import java.util.*;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        
        int x = n;
        while(true){
            list.add(x);
            
            if(x == 1) break;
            
            if(x%2 == 0){
                x /= 2;
            } else {
                x = 3*x+1;
            }
        }
        
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}