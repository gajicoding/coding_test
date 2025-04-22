class Solution {
    public int[] solution(int[] arr, int n) {
        boolean b = arr.length % 2 == 1;
        for (int i = b ? 0 : 1; i < arr.length; i+=2) {
            arr[i] += n;
        }

        return arr;
    }
}