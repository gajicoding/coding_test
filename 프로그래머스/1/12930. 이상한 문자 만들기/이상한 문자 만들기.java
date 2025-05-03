import java.util.stream.IntStream;
import java.util.stream.Collectors;

class Solution {
    public String solution(String s) {
//         String[] arr = s.split("", -1);
//         String answer = "";
        
//         for (int i=0, j = 0; i<arr.length; i++) {
//             answer += (j++) % 2 == 0 ? arr[i].toUpperCase() : arr[i].toLowerCase();
            
//             if(arr[i].equals(" ")){
//                 j = 0;
//             }
//         }
//         return answer;
        
//         String[] arr = s.split("", -1);
//         int[] j = {0};
//         return IntStream.range(0, s.length())
//                 .mapToObj(i -> {
//                     if (arr[i].equals(" ")) {
//                         j[0] = 0;
//                         return " ";
//                     }
//                     return (j[0]++) % 2 == 0 ? arr[i].toUpperCase() : arr[i].toLowerCase();
//                 })
//                 .collect(Collectors.joining());
        
        String[] arr = s.split("", -1);
        int[] j = {0};
        return IntStream.range(0, s.length())
                    .mapToObj(i -> arr[i].equals(" ") 
                        ? (j[0] = 0) == 0 ? " " : " "
                        : (j[0]++ % 2 == 0) ? arr[i].toUpperCase() : arr[i].toLowerCase())
                    .collect(Collectors.joining());
    }
}