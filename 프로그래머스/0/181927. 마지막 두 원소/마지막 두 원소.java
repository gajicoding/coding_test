import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = Arrays.copyOf(num_list, num_list.length + 1);
        int n = num_list.length;
        
        answer[n] = num_list[n-1] > num_list[n-2] ? num_list[n-1] - num_list[n-2] : num_list[n-1]*2;
        return answer;
    }
}