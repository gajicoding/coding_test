import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public long solution(long n) {
        // 카운팅 정렬: O(n+k) = O(10+10) = O(20)
        // 병합 정렬: O(n log n) = O(10 log 10) = O(33.21928...)
        // 퀵 정렬: O(n^2) = O(10^2) = O(100)
        
        // Arrays.sort()
        // 0.28 ~ 0.58 ms
        // String[] arr = Long.toString(n).split("");
        // Arrays.sort(arr, Comparator.reverseOrder());
        // String answer = String.join("", arr);
        // return Long.parseLong(answer);
        

        // 카운팅 정렬
        // 0.05 ~ 0.10 ms
        // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
        // [0, 2, 1, 1, 0, 0, 0, 1, 1, 0]
//         int[] count = new int[10];  // 0 ~ 9
        
//         for(char c: Long.toString(n).toCharArray()){
//             count[c - '0']++;
//         }
        
//         StringBuilder sb = new StringBuilder();
        
//         for (int i = 9; i >= 0; i--) {
//             while (count[i]-- > 0) {
//                 sb.append(i);
//             }
//         }
    
//         return Long.parseLong(sb.toString());
        
        
        
        // 카운팅 정렬, 문자 없이
        // 0.02 ~ 0.03 ms
        int[] count = new int[10];  // 0 ~ 9
        
        while (n > 0) {
            count[(int)(n % 10)]++;
            n /= 10;
        }
        
        long result = 0;
        for (int i = 9; i >= 0; i--) {
            for (int j = 0; j < count[i]; j++) {
                result = result * 10 + i;
            }
        }

        return result;
    
        
        
        // 6.89 ~ 10.52ms
        // String answer = Arrays.stream((n+"").split(""))
        //                     .sorted(Comparator.reverseOrder())
        //                     .collect(Collectors.joining(""));
        // return Long.parseLong(answer);
    }
}