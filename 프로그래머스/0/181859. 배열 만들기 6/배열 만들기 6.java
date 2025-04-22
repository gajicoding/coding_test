import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stk = new Stack<>();
        int i = 0;

        while (i < arr.length) {
            if (stk.isEmpty()) {
                stk.push(arr[i]);
            } else if (stk.peek() == arr[i]) {
                stk.pop();
            } else {
                stk.push(arr[i]);
            }
            i++;
        }

        if (stk.isEmpty()) {
            return new int[]{-1};
        }

        int[] result = new int[stk.size()];
        int idx = stk.size() - 1;
        while (!stk.isEmpty()) {
            result[idx--] = stk.pop();
        }

        return result;
    }
}