class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = my_string;
        
        for(int[] q: queries) {
            answer = answer.substring(0, q[0])
             + new StringBuilder(answer.substring(q[0], q[1]+1)).reverse().toString()
                + answer.substring(q[1]+1);
        }
        return answer;
    }
}