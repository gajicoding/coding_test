import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int target = sc.nextInt();
        int start = 1, end = 1, sum = 0;
        int count = 0;

        while(end <= target){
           sum += end++;

           while(sum > target){
               sum -= start++;
           }

           if(sum == target) count++;
        }

        System.out.println(count);

        sc.close();
    }
}