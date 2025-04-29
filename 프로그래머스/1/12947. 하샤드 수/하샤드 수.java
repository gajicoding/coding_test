import java.util.*;

class Solution {
    public boolean solution(int x) {
        int sum = Arrays.stream((x+"").split(""))
                        .mapToInt(s -> Integer.parseInt(s))
                        .sum();
        
        return x % sum == 0;
    }
}