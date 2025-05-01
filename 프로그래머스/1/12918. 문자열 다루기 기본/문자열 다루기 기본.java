import java.util.Arrays;

class Solution {
    public boolean solution(String s) {
        if(s.length() != 4 && s.length() != 6) {
            return false;
        }
        return Arrays.stream(s.split("")).allMatch(x -> x.matches("\\d"));
    }
}