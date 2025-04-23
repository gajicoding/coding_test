import java.util.Arrays;
import java.util.stream.*;

class Solution {
    public String solution(String myString) {
        return Arrays.stream(myString.split(""))
                        .map(s -> s.charAt(0) < 'l' ? "l" : s)
                        .collect(Collectors.joining());
    }
}