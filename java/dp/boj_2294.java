package dp;

import java.io.*;
import java.util.*;

public class boj_2294 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int n, k;
    static int[] dp;
    static int[] coin;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        coin = new int[n];
        dp = new int[k+1];

        for (int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            coin[i] = Integer.parseInt(st.nextToken());
        }

        // 초기값
        Arrays.fill(dp, 10001);
        dp[0] = 0;

        for (int i = 0; i < n; i++){
            for (int j = coin[i]; j <= k; j++){
                dp[j] = Math.min(dp[j], dp[j - coin[i]] + 1);
            }
        }

        if (dp[k] == 10001) {
            System.out.println(-1);
        }
        else System.out.println(dp[k]);
    }

}
