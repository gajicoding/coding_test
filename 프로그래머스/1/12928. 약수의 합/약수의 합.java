import java.util.stream.IntStream;

class Solution {
    public int solution(int n) {
        return IntStream.range(1, n+1)              // 1 ~ n 까지
                            .filter(i -> n%i==0)    // 약수: 나머지가 0
                            .sum();                 // 합
    }
}