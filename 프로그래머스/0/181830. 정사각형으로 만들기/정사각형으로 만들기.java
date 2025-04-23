import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public int[][] solution(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;
        int size = Math.max(row, col);

        return IntStream.range(0, size)
                .mapToObj(i -> i < row
                        ? Arrays.copyOf(arr[i], size)
                        : new int[size])
                .toArray(int[][]::new);
    }
}