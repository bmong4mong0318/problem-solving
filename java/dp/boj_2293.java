package dp;

import java.io.*;
import java.util.*;

public class boj_2293 {

    // 빠른 입력
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static StringTokenizer st;
    static int[] dp;

    static int n, k;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        // dp[k] = 합이 k원이 되는 조합
        dp = new int[k+1];
        dp[0] = 1;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int coin = Integer.parseInt(st.nextToken());

            for (int j = 1; j <= k; j++){
                if (j >= coin) dp[j] = dp[j] + dp[j - coin];
            }
        }
        System.out.println(dp[k]);
    }
}