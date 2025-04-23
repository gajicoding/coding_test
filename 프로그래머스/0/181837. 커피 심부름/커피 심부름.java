import java.util.*;

class Solution {
    public int solution(String[] order) {
        return Arrays.stream(order)
                .mapToInt(o -> o.contains("cafelatte") ? 5000 : 4500)
                .sum();
    }
}