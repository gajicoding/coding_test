import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

class Solution {
    public String[] solution(String[] strArr) {
        AtomicInteger index = new AtomicInteger(0);
        return Arrays.stream(strArr)
            .map(s -> {int i=index.getAndIncrement(); return i%2==1 ? s.toUpperCase() : s.toLowerCase();})
            .toArray(String[]::new);
    }
}