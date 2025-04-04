class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        int min;
        
        for(int i=0; i<queries.length; i++){
            min = 2000000;
            
            for(int j=queries[i][0]; j<=queries[i][1]; j++){
                if(arr[j] > queries[i][2]){
                    min = arr[j] < min ? arr[j] : min;
                }
            }
            
            if(min == 2000000){
                answer[i] = -1;
            } else {
                answer[i] = min;
            }
        }
        
        return answer;
    }
}