import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int target = sc.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int count = 0;
        int start = 0;
        int end = N - 1;

        while (start < end) {
            int sum = arr[start] + arr[end];

            if (sum == target) {
                count++;
                start++;
                end--;
            } else if (sum < target) {
                start++;
            } else {
                end--;
            }
        }
        System.out.println(count);

        sc.close();
    }
}