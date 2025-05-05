import java.util.Arrays;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int answer = 0;

        int s = sc.nextInt();
        int p = sc.nextInt();
        sc.nextLine();
        
        String str = sc.nextLine();
        int[] rule = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int[] count = new int[4];
        for (int i = 0; i < p; i++) {
            addChar(count, str.charAt(i));
        }

        if (isValid(count, rule)) answer++;

        for (int i = p; i < s; i++) {
            addChar(count, str.charAt(i));               // 들어온 문자
            removeChar(count, str.charAt(i - p));  // 나간 문자

            if (isValid(count, rule)) answer++;
        }

        System.out.println(answer);
    }

    private static void addChar(int[] count, char c) {
        switch(c) {
            case 'A' -> count[0]++;
            case 'C' -> count[1]++;
            case 'G' -> count[2]++;
            case 'T' -> count[3]++;
            default -> {}
        }
    }

    private static void removeChar(int[] count, char c) {
        switch(c) {
            case 'A' -> count[0]--;
            case 'C' -> count[1]--;
            case 'G' -> count[2]--;
            case 'T' -> count[3]--;
            default -> {}
        }
    }

    private static boolean isValid(int[] count, int[] required) {
        for (int i = 0; i < 4; i++) {
            if (count[i] < required[i]) return false;
        }
        return true;
    }
}