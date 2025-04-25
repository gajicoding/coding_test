import java.util.*;

class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int videoLen = convert(video_len);
        int now = convert(pos);
        int opStart = convert(op_start);
        int opEnd = convert(op_end);
        
        if(now >= opStart && now < opEnd) now = opEnd;
        
        for(String c: commands){
            now += c.equals("next") ? 10 : -10;
            
            if(now < 0) now = 0;
            if(now >= opStart && now < opEnd) now = opEnd;
            if(now > videoLen) now = videoLen;
            
            System.out.println(now);
        }
        
        return String.format("%02d:%02d", now/60, now%60);
        
    }
    
    private int convert(String s){
        int[] sArr = Arrays.stream(s.split(":")).mapToInt(Integer::parseInt).toArray();

        return sArr[0]*60 + sArr[1];
    }

}