import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = sc.nextInt();
        sc.nextLine();

        Stack<Integer> stack = new Stack<>();

        int j = 1;
        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();

            while (j <= num) {
                stack.push(j++);
                sb.append("+\n");
            }

            if(stack.peek() == num){
                stack.pop();
                sb.append("-\n");
            } else {
                sb.setLength(0);
                sb.append("NO\n");
                break;
            }
        }
        System.out.println(sb);
    }
}