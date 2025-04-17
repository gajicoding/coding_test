class Solution {
    public int solution(int[] num_list) {
        int[] arr = num_list.clone();
        int i = 0;
        
        for(int a: arr){
            while(a != 1){
                if(a%2 == 1) a--;
                a /= 2;
                i++;
            }
        }
        
        return i;
    }
}