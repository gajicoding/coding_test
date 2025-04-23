import java.util.*;

class Solution {
    public int solution(String[] babbling) {
        return Arrays.stream(babbling)
                        .map(s -> s.replace("aya", "+")
                                    .replace("ye", "+")
                                    .replace("woo", "+")
                                    .replace("ma", "+").replace("+", "")
                        ).filter(s->s.equals(""))
                        .toArray(String[]::new).length;
    }
}