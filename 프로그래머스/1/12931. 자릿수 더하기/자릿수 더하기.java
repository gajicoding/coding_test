import java.util.*;

public class Solution {
    public int solution(int n) {
        return Arrays.stream((n+"").split(""))                  // int->String 변환 후 한 글자씩 자르기
                        .mapToInt(s -> Integer.parseInt(s))     // int로 변환
                        .sum();                                 // 합 
    }
}