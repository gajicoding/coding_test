import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        return Arrays.stream(arr)
                    .map(a -> k%2==1 ? a*k : a+k)
                    .toArray();
    }
}