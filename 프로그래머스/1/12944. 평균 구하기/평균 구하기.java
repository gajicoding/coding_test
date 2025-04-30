import java.util.*;
import java.util.stream.*;

class Solution {
    public double solution(int[] arr) {
        int sum = 0;
        for(int a: arr) sum += a;
        return (double)sum/arr.length;                        // 0.08ms
        
        // return IntStream.of(arr).average().orElse(0);      // 2.13ms
        
        // return Arrays.stream(arr).average().orElse(0);  // 3.76ms
    }
}