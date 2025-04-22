import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String[] strArr) {
        Map<Integer, Integer> hm = new HashMap<>();

        for (String str : strArr) {
            int length = str.length();
            hm.put(length, hm.getOrDefault(length, 0) + 1);
        }

        int max = 0;
        for (int count : hm.values()) {
            max = Math.max(max, count);
        }

        return max;
    }
}