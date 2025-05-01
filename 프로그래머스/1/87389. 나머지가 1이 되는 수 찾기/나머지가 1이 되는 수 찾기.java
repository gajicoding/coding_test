import java.util.stream.IntStream;

class Solution {
    public int solution(int n) {
        
        // while
        int i=0, answer=0;
        while(answer != 1){
            answer = n % ++i;
        }
        return i;
        
        
//         // for
//         for (int i = 1; i < n; i++) {
//             if (n % i == 1) {
//                 return i;
//             }
//         }
//         return -1;
        
        
//         return IntStream.range(1, n)
//                         .filter(i -> n % i == 1)
//                         .findFirst()                // 첫번째만 가져오기 = 가장 작은 i
//                         .getAsInt();                // Optional -> int
        
    }
}