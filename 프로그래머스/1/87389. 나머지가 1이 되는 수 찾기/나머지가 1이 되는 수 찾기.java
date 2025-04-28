class Solution {
    public int solution(int n) {
        int i=0, answer=0;
        while(answer != 1){
            answer = n % ++i;
        }
        return i;
    }
}