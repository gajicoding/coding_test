import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] counts = new int[7];
        counts[a]++;
        counts[b]++;
        counts[c]++;
        counts[d]++;

        List<Integer> values = new ArrayList<>();
        for (int i = 1; i <= 6; i++) {
            if (counts[i] > 0) {
                values.add(i);
            }
        }

        int size = values.size();

        if (size == 1) {
            return 1111 * values.get(0);
        }

        if (size == 2) {
            int first = values.get(0);
            int second = values.get(1);
            int cnt1 = counts[first];
            int cnt2 = counts[second];

            if (cnt1 == 3 || cnt2 == 3) {
                int p = cnt1 == 3 ? first : second;
                int q = cnt1 == 1 ? first : second;
                return (int) Math.pow(10 * p + q, 2);
            } else {
                return (first + second) * Math.abs(first - second);
            }
        }

        if (size == 3) {
            int pair = 0, single1 = 0, single2 = 0;
            for (int i = 1; i <= 6; i++) {
                if (counts[i] == 2) {
                    pair = i;
                } else if (counts[i] == 1) {
                    if (single1 == 0) single1 = i;
                    else single2 = i;
                }
            }
            return single1 * single2;
        }

        return Math.min(Math.min(a, b), Math.min(c, d));
    }
}