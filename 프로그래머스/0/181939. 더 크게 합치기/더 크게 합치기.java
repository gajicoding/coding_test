class Solution {
    public static int fun(int a, int b){
		   return Integer.parseInt(Integer.toString(a)+Integer.toString(b));
	}
    
    public int solution(int a, int b) {
        int answer = fun(a, b) > fun(b, a) ? fun(a, b) : fun(b, a);
        return answer;
    }
}