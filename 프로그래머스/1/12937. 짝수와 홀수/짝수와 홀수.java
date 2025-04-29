import java.util.stream.IntStream;

class Solution {
    public String solution(int num) {
        // return num%2 == 0 ? "Even" : "Odd";
        
        return (num&1) == 0 ? "Even" : "Odd";
        /*
            num = 3, 11 & 01 = 01 == 1
            num = 4, 100 & 001 = 000 == 0
            num = 5, 101 & 001 = 001 == 1
        */
        
        // return num/2*2 == num ? "Even" : "Odd";
    
        
        
        
        
        // return IntStream.of(num).allMatch(n -> n % 2 == 0) ? "Even" : "Odd";
        
        // return IntStream.of(num).noneMatch(n -> n % 2 == 1) ? "Even" : "Odd";
        
        /*
            allMatch(): 모두 만족하면 true
            anyMatch(): 하나라도 만족하면 true 
            noneMatch(): 모두 만족하지 않으면 true
        */
    }
}