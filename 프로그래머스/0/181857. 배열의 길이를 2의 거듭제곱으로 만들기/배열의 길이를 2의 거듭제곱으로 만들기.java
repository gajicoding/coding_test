import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int length = arr.length;
        int size = 1;

        while (size < length) {
            size *= 2;
        }

        int[] answer = Arrays.copyOf(arr, size);

        return answer;
    }
}