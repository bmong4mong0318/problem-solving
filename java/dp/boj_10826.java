package dp;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class boj_10826 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BigInteger[] dp = new BigInteger [10001];

    public static void main(String[] args) throws IOException {

        int N = Integer.parseInt(br.readLine());

        dp[0] = BigInteger.valueOf(0);
        dp[1] = BigInteger.valueOf(1);
        for (int i = 2; i <= N; i++){
            dp[i] = dp[i-1].add(dp[i-2]);
        }

        System.out.println(dp[N]);
    }
}
