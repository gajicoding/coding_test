import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numN = sc.nextInt();
        int psN = sc.nextInt();

        int[] s = new int[numN + 1];

        for(int i = 1; i <= numN; i++) {
            int num = sc.nextInt();
            s[i] += s[i - 1] + num;
        }

        for(int i = 0; i < psN; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(s[b] - s[a - 1]);
        }

        sc.close();
    }
}