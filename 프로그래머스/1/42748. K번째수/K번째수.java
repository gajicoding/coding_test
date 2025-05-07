import java.util.Arrays;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        return Arrays.stream(commands).mapToInt(c -> {
            int[] subArr = Arrays.copyOfRange(array, c[0]-1, c[1]);
            Arrays.sort(subArr);
            return subArr[c[2]-1];
        }).toArray();
    }
}