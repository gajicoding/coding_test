class Solution {
    public int solution(int n) {
        if(n%2 == 1){
            return (int)Math.pow((n+1)/2, 2);
        } else {
            return (n*(n/2+1)*(n+1))/3;
        }
    }
}