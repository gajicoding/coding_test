class Solution {
    public long solution(long n) {
        // 0.03 ~ 0.08 ms
        // long s = (long)Math.sqrt(n);
        // return s*s== n ? (s+1)*(s+1) : -1;
        
        
        
        // 이진 탐색
        // 0.01 ~ 0.6 ms
        long low = 1, high = n;
        
        while (low <= high) {
            long mid = (low + high) / 2;    
            
            if (mid == (double)n / mid) {
                return (mid + 1) * (mid + 1);
            }
            
            if (mid < n / mid) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        
        return -1;
    }
}