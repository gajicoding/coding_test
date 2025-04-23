class Solution {
    public int solution(int n, int w, int num) {
        // 총 몇층 몇번째
        int totalF = getF(w, n-1);  // 1을 뺀다. 계산이 훨씬 편리해짐
        int topMaxIndex = getIndex(w, totalF, n-1);
        
        // 선택한 상자
        int numF = getF(w, num-1);
        int numIndex = getIndex(w, numF, num-1);
        
        // 짝수층 ->
        // 홀수층 <-
        
        int count = (totalF - numF);
        if (totalF % 2 == 0) {
            count += (topMaxIndex >= numIndex) ? 1 : 0;
        } else {
            count += (topMaxIndex <= numIndex) ? 1 : 0;
        }
        
        return count;
    }
    
    private int getF(int w, int n) {
        return n/w;
    }
    
    private int getIndex(int w, int f, int n) {
        if(f % 2 == 0){
            return n%w; 
        } else {
            return w - 1 - (n % w);
        }
    }
}