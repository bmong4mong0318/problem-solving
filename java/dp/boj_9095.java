package dp;

import java.util.Scanner;

public class boj_9095 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] d = new int[100];
        d[1] = 1; d[2] = 2; d[3] = 4;
        for (int i = 4; i < 11; i++)
            d[i] = d[i - 1] + d[i - 2] + d[i - 3];

        int T = scanner.nextInt();
        for (int i = 0; i < T; i++) {
            int N = scanner.nextInt();
            System.out.println(d[N]);
        }
    }
}
