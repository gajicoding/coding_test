import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public long solution(long n) {
        String answer = Arrays.stream((n+"").split(""))
                            .sorted(Comparator.reverseOrder())
                            .collect(Collectors.joining(""));
        return Long.parseLong(answer);
    }
}