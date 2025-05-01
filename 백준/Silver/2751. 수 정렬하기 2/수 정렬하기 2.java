import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        int[] count = new int[10000001];

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine()) + 1000000;
            count[num]++;
        }


        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                for (int j = 0; j < count[i]; j++) {
                    sb.append(i - 1000000).append('\n');
                }
            }
        }

        System.out.println(sb);
    }
}