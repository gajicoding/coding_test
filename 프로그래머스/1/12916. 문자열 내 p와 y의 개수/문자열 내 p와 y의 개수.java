import java.util.stream.IntStream;

class Solution {
    boolean solution(String s) {
        int count = 0;
        for(char c : s.toCharArray()){
            count += switch(c){
                case 'P', 'p' -> 1;
                case 'Y', 'y' -> -1;
                default -> 0;
            };
        }
        return count == 0;
        

        // return s.toUpperCase().chars().filter(c -> c == 'P').count()
        //         == s.toUpperCase().chars().filter(c -> c == 'Y').count();
    }
}