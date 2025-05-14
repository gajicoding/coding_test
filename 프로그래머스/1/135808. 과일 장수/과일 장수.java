import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        Integer[] arr = Arrays.stream(score)
                                 .boxed()
                                 .toArray(Integer[]::new);
        Arrays.sort(arr, Collections.reverseOrder());

        int result = 0;

        for (int i = 0; i + m <= arr.length; i += m) {
            result += arr[i + m - 1] * m;
        }

        return result;
    }
}