import java.util.stream.LongStream;

class Solution {
    public long solution(int price, int money, int count) {
        long answer = LongStream.rangeClosed(1, count)
                                .reduce(money, (acc, i) -> acc - price*i);
        return answer < 0 ? -answer : 0;
    }
}