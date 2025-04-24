import java.util.*;

class Solution {
    public int[] solution(long n) {
        int[] answer = {};
        return new StringBuilder(n+"")
                .reverse()
                .chars()
                .map(c -> c - '0')
                .toArray();
    }
}