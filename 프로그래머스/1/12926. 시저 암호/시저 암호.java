class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for(char c: s.toCharArray()){
            
            
            char sn = (char)(c + n);
            
            if(c == ' '){
                sn = ' ';
            } else if(c <= 'Z' && sn > 'Z'){
                sn -= 26;
            } else if(c >= 'a' && sn > 'z') {
                sn -= 26;
            }
            
            answer += sn;
                
        }
        return answer;
    }
}