import java.util.stream.IntStream;

class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        return IntStream.range(0, arr1.length)
                    .mapToObj(i -> IntStream.range(0, arr1[i].length)
                                .map(j -> arr1[i][j] + arr2[i][j])
                                .toArray()
                    ).toArray(int[][]::new);
    }
}