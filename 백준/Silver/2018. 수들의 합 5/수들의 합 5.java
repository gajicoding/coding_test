import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int target = sc.nextInt();
        int start = 1, end = 1, sum = 1;
        int count = 1;

        while(end < target){
            if(sum == target) {
                count++;
                end++;
                sum += end;
            } else if(sum > target) {
                sum -= start;
                start++;
            } else {
                end++;
                sum += end;
            }
        }

        System.out.println(count);

        sc.close();
    }
}