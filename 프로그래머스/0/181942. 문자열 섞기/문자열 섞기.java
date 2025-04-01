class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        
        int j=0, k=0;
        for(int i=0; i<str1.length()*2; i++){
            answer += i%2==0 ? str1.charAt(j++) : str2.charAt(k++);
        }
        return answer;
    }
}