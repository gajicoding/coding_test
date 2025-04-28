class Solution {
    public long solution(long n) {
        long s = (long)Math.sqrt(n);
        return s*s== n ? (s+1)*(s+1) : -1;
    }
}