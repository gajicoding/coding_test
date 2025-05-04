import java.util.stream.IntStream;

class Solution {
    public int solution(String t, String p) {
//         int n = t.length();
//         int r = p.length();
//         long pInt = Long.parseLong(p);
        
//         int count = 0;
        
//         for(int i=0; i<n-r+1; i++){
//             Long number = Long.parseLong(t.substring(i, i+r));
//             if(number <= pInt) count++;
            
//         }
        
//         return count;
        
        
        return (int)IntStream.range(0, t.length()-p.length()+1)
                    .mapToLong(i -> Long.parseLong(t.substring(i, i+p.length())))
                    .filter(n -> n <= Long.parseLong(p))
                    .count();
    }
}