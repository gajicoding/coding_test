import java.util.*;
import java.util.stream.*;

class Solution {
    public String[] solution(String[] picture, int k) {
        return Arrays.stream(picture)
            .flatMap(row -> IntStream.range(0, k)
                .mapToObj(i -> row.chars()
                    .mapToObj(c -> String.valueOf((char) c).repeat(k))
                    .collect(Collectors.joining())))
            .toArray(String[]::new);
    }
}