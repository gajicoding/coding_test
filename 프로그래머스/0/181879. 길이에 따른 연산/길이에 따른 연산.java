import java.util.*;

class Solution {
    public int solution(int[] num_list) {
        return num_list.length >= 11
            ? Arrays.stream(num_list).reduce(0, (a, n)->a+n)
            : Arrays.stream(num_list).reduce(1, (a, n)->a*n);
    }
}