class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int a = n==1 ? 0 : slicer[0];
        int b = n==2 ? num_list.length-1 : slicer[1];
        int c = n==4 ? slicer[2] : 1;
        
        int[] answer = new int[(b-a)/c +1];
        for(int i=a, j=0; i<=b; i+=c, j++){
            answer[j] = num_list[i];
        }
        return answer;
    }
}