import java.util.*;

class Solution {
    public int[] solution(long n) {
        return new StringBuilder(n+"")  // long -> StringBuilder
                .reverse()              // 거꾸로
                .chars()                // String -> IntStream
                .map(c -> c - '0')      // '0' -> 0
                .toArray();             // stream -> 배열
    }
}
