import java.util.stream.IntStream;

class Solution {
    public int solution(int[] number) {
//         int count = 0; 
//         for(int i=0; i<number.length-2; i++){
//             for(int j=i+1; j<number.length-1; j++){
//                 for(int k=j+1; k<number.length; k++){
//                     if(number[i] + number[j] + number[k] == 0){
//                         count++;
//                     }
//                 }    
//             }
//         }
//         return count;
        
        
        return (int)IntStream.range(0, number.length-2)
            .flatMap(i -> IntStream.range(i+1, number.length-1)
                .flatMap(j -> IntStream.range(j+1, number.length)
                        .filter(k -> number[i] + number[j] + number[k] == 0)))
            .count();
    }
}