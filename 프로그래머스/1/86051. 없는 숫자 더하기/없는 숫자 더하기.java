import java.util.stream.IntStream;

class Solution {
    public int solution(int[] numbers) {
        // int answer = 45;
        int answer = IntStream.rangeClosed(0, 9).sum();
            
        for (int n: numbers){
            answer -= n;
        }
        return answer;
    }
}