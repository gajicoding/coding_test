import java.util.Comparator;
import java.util.stream.Collectors;

class Solution {
    public String solution(String s) {
        return s.chars()
                .mapToObj(c -> (char) c)
                .sorted(Comparator.reverseOrder())
                .map(String::valueOf)       // Character-> String
                .collect(Collectors.joining());
    }
}