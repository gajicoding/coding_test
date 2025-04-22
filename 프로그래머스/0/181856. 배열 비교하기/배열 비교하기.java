import java.util.Arrays;

class Solution {
    public int solution(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return arr1.length > arr2.length ? 1 : -1;
        }
        
        int sum1 = Arrays.stream(arr1).reduce(0, Integer::sum);
        int sum2 = Arrays.stream(arr2).reduce(0, Integer::sum);

        if (sum1 != sum2) {
            return sum1 > sum2 ? 1 : -1;
        }
        
        return 0;
    }
}