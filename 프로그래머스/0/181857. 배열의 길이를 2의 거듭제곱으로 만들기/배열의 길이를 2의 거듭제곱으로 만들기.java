import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int size = 1;

        while (size < arr.length) {
            size *= 2;
        }

        int[] answer = Arrays.copyOf(arr, size);

        return answer;
    }
}