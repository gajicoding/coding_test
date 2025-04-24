import java.util.stream.IntStream;

class Solution {
    public int solution(int n) {
        return IntStream.rangeClosed(1, n)          // 1 ~ n 까지
                            .filter(i -> n%i==0)    // 나머지가 0인 수만 필터링
                            .sum();                 // 합
    }
}