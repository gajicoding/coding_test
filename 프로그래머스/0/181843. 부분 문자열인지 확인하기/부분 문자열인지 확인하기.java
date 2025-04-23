class Solution {
    public int solution(String my_string, String target) {
        String[] arr = my_string.split(target, -1);
        return arr.length > 1 ? 1 : 0;
    }
}