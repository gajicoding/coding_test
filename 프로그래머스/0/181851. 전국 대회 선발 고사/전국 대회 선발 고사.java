import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < rank.length; i++) {
            if (attendance[i]) {
                list.add(i);
            }
        }

        list.sort(Comparator.comparingInt(i -> rank[i]));

        return 10000*list.get(0) + 100*list.get(1) + list.get(2);
    }
}