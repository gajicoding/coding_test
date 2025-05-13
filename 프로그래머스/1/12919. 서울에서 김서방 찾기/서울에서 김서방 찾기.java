import java.util.*;
import java.util.stream.IntStream;

class Solution {
    public String solution(String[] seoul) {
        for (int i=0; i<seoul.length; i++){
            if(seoul[i].equals("Kim")){
                return "김서방은 " + i + "에 있다";
            }
        }
        return "";
        
        
        // int index = IntStream.range(0, seoul.length)
        //                      .filter(i -> seoul[i].equals("Kim"))
        //                      .findFirst()
        //                      .orElse(-1);
        // return "김서방은 " + index + "에 있다";
    }
}