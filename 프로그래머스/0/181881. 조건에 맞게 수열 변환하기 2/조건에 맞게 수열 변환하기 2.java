import java.util.Arrays;

class Solution {
    public int[] fun(int[] arr) {
        int[] answer = arr.clone();
        
        for(int i=0; i<answer.length; i++){
            if(answer[i] >= 50 && answer[i]%2 == 0){
                answer[i] /= 2;
            } else if(answer[i] < 50 && answer[i]%2 == 1){
                answer[i] = answer[i]*2 + 1;
            }
        }
        return answer;
    }
    
    public int solution(int[] arr) {
        int[] a = arr.clone();
        
        int i=0;
        int[] temp = new int[arr.length];
        while(true){
            temp = fun(a);
            if(Arrays.equals(a, temp)){
                break;
            }
            a = temp;
            i++;
        }
        
        return i;
    }
}