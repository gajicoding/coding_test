import java.util.stream.IntStream;

class Solution {
    public String solution(String phone_number) {
        return "*".repeat(phone_number.length() - 4) + phone_number.substring(phone_number.length() - 4);
        
        // return IntStream.range(0, phone_number.length())
        //         .mapToObj(i -> i < length - 4 ? "*" : String.valueOf(phone_number.charAt(i)))
        //         .reduce("", (a, b) -> a + b);
            
    }
}