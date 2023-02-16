package dp;

import java.io.*;
import java.util.*;

public class boj_2839 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        int[] dp = new int[N + 1];
        Arrays.fill(dp, 10001);

        int[] arr = new int[]{3, 5};
        dp[0] = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 1; j <= N; j++) {
                if (j >= arr[i])
                    dp[j] = Math.min(dp[j], dp[j - arr[i]] + 1);
            }
        }
        if (dp[N] == 10001)
            System.out.println(-1);
        else
            System.out.println(dp[N]);
    }
}
