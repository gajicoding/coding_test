import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        // 중복 없이 -1,000,000 ~ 1,000,000 값 입력
        boolean[] arr = new boolean[2000001];

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine()) + 1000000;
            arr[num] = true;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]) {
                sb.append(i - 1000000).append('\n');
            }
        }

        System.out.println(sb);
    }
}