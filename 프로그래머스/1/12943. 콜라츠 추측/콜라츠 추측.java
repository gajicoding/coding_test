class Solution {
    public int solution(int num) {
        long n = num;
        int i=0;
        while (i <= 500) {
            if(n == 1){
                return i;
            }
            
            i++;
            
            if (n % 2 == 0) n /= 2;
            else n = n*3 + 1;
        }
        return -1;
    }
}