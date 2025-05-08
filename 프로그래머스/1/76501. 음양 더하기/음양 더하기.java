import java.util.stream.IntStream;

class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        // 0.04 ~ 0.07 ms
        // int answer = 0;
        // for (int i=0; i<signs.length; i++){
        //     answer += signs[i] ? absolutes[i] : -1*absolutes[i];
        // }
        // return answer;
        
        // 1.67 ~ 2.58 ms
        // return IntStream.range(0, signs.length)
        //                 .map(i -> signs[i] ? absolutes[i] : -1*absolutes[i])
        //                 .sum();
        
        return IntStream.range(0, signs.length)
                        .reduce(0, (acc, i) -> acc + (signs[i] ? absolutes[i] : -1*absolutes[i]));
    }
}