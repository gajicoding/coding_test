import java.util.*;

class Solution {
    public String[] solution(String[] picture, int k) {
        List<String> result = new ArrayList<>();

        for (String row : picture) {
            String rowk = row.chars()
                .mapToObj(c -> String.valueOf((char) c).repeat(k))
                .reduce("", String::concat);

            for (int i = 0; i < k; i++) {
                result.add(rowk);
            }
        }

        return result.toArray(new String[0]);
    }
}