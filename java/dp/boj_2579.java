package dp;

import java.util.Scanner;

public class boj_2579 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] stair = new int [301];
        int[][] dp = new int [301][3];
        int N = scanner.nextInt();

        for(int i = 1; i <= N; i++){
            stair[i] = scanner.nextInt();
        }
        if (N == 1){
            System.out.println(stair[1]);
            System.exit(0);
        }
        dp[1][1] = stair[1];
        dp[1][2] = 0;
        dp[2][1] = stair[2];
        dp[2][2] = stair[1] + stair[2];
        for(int i = 3; i <= N; i++){
            dp[i][1] = Math.max(dp[i-2][1], dp[i-2][2])+stair[i];
            dp[i][2] = dp[i-1][1]+stair[i];
        }
        System.out.println(Math.max(dp[N][1], dp[N][2]));
    }
}
