package dp;

import java.io.*;
import java.util.*;

public class boj_2193 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int N;
    static long[][] dp;
    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        dp = new long[N + 1][N + 1];

        dp[0][0] = 0;
        dp[0][1] = 1;
        LeeCheonSoo(N);
        System.out.println(dp[N-1][0] + dp[N-1][1]);
    }

    private static void LeeCheonSoo(int n) {
        for (int i = 1; i < n; i++){

            dp[i][0] = dp[i-1][0] + dp[i-1][1];
            dp[i][1] = dp[i-1][0];
        }
    }

}
