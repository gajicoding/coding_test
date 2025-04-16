import java.util.*;

class Solution {
    public int solution(int[] num_list) {
        int[] sum = {0, 0};
        
        for(int i=0; i<num_list.length; i++){
            sum[i%2] += num_list[i];
        }
        
        return Arrays.stream(sum).max().getAsInt();
    }
}