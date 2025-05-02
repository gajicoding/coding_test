class Solution {
    public String solution(String s) {
        String answer = "";
        
        for (int i=0, j = 0; i<s.length(); i++) {
            answer += (j++)%2 == 0 ? (s.charAt(i)+"").toUpperCase() : (s.charAt(i)+"").toLowerCase();
            
            if((s.charAt(i)+"").equals(" ")){
                j = 0;
            }
        }
        return answer;
    }
}