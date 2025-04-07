import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();

        for (int i = l; i <= r; i++) {
            String s = String.valueOf(i);
            boolean isValid = true;

            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                if (c != '0' && c != '5') {
                    isValid = false;
                    break;
                }
            }

            if (isValid) {
                list.add(i);
            }
        }

        if (list.isEmpty()) {
            return new int[] { -1 };
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
