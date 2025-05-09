class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int current = n;
        
        while (current >= a) {
            answer += current/a * b;
            current = current/a * b + (current % a);
        }
        return answer;
    }
}