package dp;

import java.io.*;
import java.util.*;

public class boj_11052 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int n;
    static int[] P;
    static int[] dp;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());

        P = new int[n + 1];
        dp = new int[n + 1];

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++){
            P[i] = Integer.parseInt(st.nextToken());
        }

        dp[1] = P[1];
        // dp[k] = 합이 k가 되는 pi들의 합의 최댓값;
        for (int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if (j >= i)
                    dp[j] = Math.max(dp[j], dp[j - i] + P[i]);
            }
        }
        System.out.println(dp[n]);
    }
}
