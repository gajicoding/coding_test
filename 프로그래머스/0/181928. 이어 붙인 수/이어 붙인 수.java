class Solution {
    public int solution(int[] num_list) {
        String[] a = new String[]{"", ""};;
        
        for(int i=0; i<num_list.length; i++){
            a[num_list[i]%2] += "" + num_list[i];
        }
        
        return Integer.parseInt(a[0]) + Integer.parseInt(a[1]);
    }
}