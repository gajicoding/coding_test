class Solution {
    public int[] solution(int n, int m) {
        int gcd = n;            // 최대 공약수
        int a = m;
        
        while (a != 0) {
            int temp = gcd % a;
            gcd = a;
            a = temp;
        }
        
        int lcm = (n*m) / gcd;  // 최소 공배수
        
        return new int[]{gcd, lcm};
        
    }
}