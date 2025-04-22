class Solution {
    public int solution(String myString, String pat) {
        String reString = myString.replace('A', 'C').replace('B', 'A').replace('C', 'B');
        return reString.contains(pat) ? 1 : 0;
    }
}