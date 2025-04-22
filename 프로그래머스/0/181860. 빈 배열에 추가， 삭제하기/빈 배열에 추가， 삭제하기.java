import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        List<Integer> x = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (flag[i]) {
                for (int j = 0; j < arr[i] * 2; j++) {
                    x.add(arr[i]);
                }
            } else {
                int count = arr[i];
                int size = x.size();
                for (int j = 0; j < count; j++) {
                    x.remove(size - 1 - j);
                }
            }
        }

        return x.stream().mapToInt(Integer::intValue).toArray();
    }
}