import java.util.Arrays;

class Solution {
    public int solution(int[][] sizes) {
        int[] max = new int[2];
        
        for(int[] size: sizes){
            Arrays.sort(size);
            max[0] = Math.max(max[0], size[0]);
            max[1] = Math.max(max[1], size[1]);
        }
        
        return max[0]*max[1];
    }
}