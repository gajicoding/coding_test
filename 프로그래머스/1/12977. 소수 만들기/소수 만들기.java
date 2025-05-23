class Solution {
    public int solution(int[] nums) {
        int count = 0;
        int n = nums.length;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    int sum = nums[i] + nums[j] + nums[k];

                    if (sum < 2) continue;

                    boolean isPrime = true;
                    for (int d = 2; d * d <= sum; d++) {
                        if (sum % d == 0) {
                            isPrime = false;
                            break;
                        }
                    }

                    if (isPrime) count++;
                }
            }
        }

        return count;
    }
}