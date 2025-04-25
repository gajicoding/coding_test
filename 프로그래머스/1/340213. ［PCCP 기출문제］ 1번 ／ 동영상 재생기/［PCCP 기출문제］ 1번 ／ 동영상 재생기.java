import java.util.*;

class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int videoLen = toSeconds(video_len);
        int now = toSeconds(pos);
        int opStart = toSeconds(op_start);
        int opEnd = toSeconds(op_end);
        
        if(now >= opStart && now < opEnd) now = opEnd;
        
        for(String c: commands){
            if(c.equals("next")){
                now += 10;
                if(now > videoLen) now = videoLen;
            } else {
                now -= 10;
                if(now < 0) now = 0;
            }
            
            if(now >= opStart && now < opEnd) now = opEnd;
        }
        
        return String.format("%02d:%02d", now/60, now%60);  
    }
    
    private int toSeconds(String s){
        int[] sArr = Arrays.stream(s.split(":")).mapToInt(Integer::parseInt).toArray();

        return sArr[0]*60 + sArr[1];
    }

}