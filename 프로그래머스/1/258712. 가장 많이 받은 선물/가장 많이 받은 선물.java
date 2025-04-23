import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int n = friends.length;
        int[][] arr = new int[n][n];
        HashMap<String, Integer> giftCount = new HashMap<>();
        HashMap<String, Integer> nameMap = new HashMap<>();
        
        int[] re = new int[n];
        
        for(int i=0; i<n; i++){
            giftCount.put(friends[i], 0);
            nameMap.put(friends[i], i);
        }
        
        String[] gArr;
        for(String g: gifts){
            gArr = g.split(" ");
            giftCount.put(gArr[0], giftCount.get(gArr[0]) + 1);
            giftCount.put(gArr[1], giftCount.get(gArr[1]) - 1);
            
            arr[nameMap.get(gArr[0])][nameMap.get(gArr[1])]++;
        }
        
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i][j] > arr[j][i]){
                    re[i]++;
                } else if(arr[i][j] < arr[j][i]){
                    re[j]++;
                } else {
                    if(giftCount.get(friends[i]) > giftCount.get(friends[j])){
                        re[i]++;
                    } else if(giftCount.get(friends[i]) < giftCount.get(friends[j])){
                        re[j]++;
                    }
                }
            }
        }
        
        return Arrays.stream(re).max().orElse(0);
    }
}