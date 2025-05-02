import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;
        int max = 0;

        int n = Integer.parseInt(br.readLine());
        String[] nums = br.readLine().split(" ");

        for(int i = 0; i < n; i++) {
            int score = Integer.parseInt(nums[i]);
            if(score > max) {
                max = score;
            }
            sum += score;
        }

        System.out.println((double)sum/max*100/n);
    }
}