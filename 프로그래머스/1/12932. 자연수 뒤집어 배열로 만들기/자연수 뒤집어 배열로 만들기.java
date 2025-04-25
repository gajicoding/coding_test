import java.util.*;

class Solution {
    public int[] solution(long n) {
        int size = (n+"").length();
        int[] answer = new int[size];
        
        for(int i = 0; i < size; i++){
            answer[i] = (int)(n % 10);
            n /= 10;;
        }
        
        return answer;
    }
}