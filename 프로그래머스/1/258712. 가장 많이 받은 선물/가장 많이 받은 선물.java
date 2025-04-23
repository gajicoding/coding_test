import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int n = friends.length;
        int[][] srTable = new int[n][n];    // 준 사람/받은 사람 표
        HashMap<String, Integer> giftCount = new HashMap<>();   // 이름: 선물 지수
        HashMap<String, Integer> nameIndex = new HashMap<>();     // 이름: index
        
        int[] nextCount = new int[n];  // 받을 선물 개수
        
        for(int i=0; i<n; i++){
            giftCount.put(friends[i], 0);
            nameIndex.put(friends[i], i);
        }
        
        String[] gArr;
        String s, r;
        for(String g: gifts){
            gArr = g.split(" ");
            s = gArr[0];    // 준 사람
            r = gArr[1];    // 받은 사람
            giftCount.put(s, giftCount.get(s) + 1);
            giftCount.put(r, giftCount.get(r) - 1);
            
            srTable[nameIndex.get(s)][nameIndex.get(r)]++;
        }
        
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(srTable[i][j] > srTable[j][i]){
                    nextCount[i]++;
                } else if(srTable[i][j] < srTable[j][i]){
                    nextCount[j]++;
                } else {
                    if(giftCount.get(friends[i]) > giftCount.get(friends[j])){
                        nextCount[i]++;
                    } else if(giftCount.get(friends[i]) < giftCount.get(friends[j])){
                        nextCount[j]++;
                    }
                }
            }
        }
        
        return Arrays.stream(nextCount).max().orElse(0);
    }
}