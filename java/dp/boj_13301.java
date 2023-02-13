package dp;

import java.io.*;
import java.util.*;

public class boj_13301 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int N;
    static long[] dp;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        dp = new long[N + 1];

        dp[0] = 1;
        dp[1] = 1;
//        dp[2] = 1; //이거 어디가 벗어나는거지?
        for (int i = 2; i <= N; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }

        long len;
        if (N == 1)
            len = 4;
        else if (N == 2)
            len = 6;
        else
            len = dp[N - 1]*4 + dp[N- 2]*2;

        System.out.println(len);
    }

}
