package math;

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
        dp = new int[n+1];

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++){
            P[i] = Integer.parseInt(st.nextToken());
        }

        dp[1] = P[1];
        // dp[k] = 합이 k가 되는 pi들의 합의 최댓값;
        for (int i = 2; i <= n; i++){
                dp[i] = Math.max(P[i], dp[i - 1] + dp[1]);
                // dp 3 = max(p3, )
        }

        for (int i = 1; i <= n; i++){
            System.out.println("i = " + i + " dp =" + dp[i]);
        }

//        System.out.println(dp[n]);

//        1)
//        1 p1
//
//        2)
//        1 1 p1 + p1
//        2   p2
//
//        3)
//        1 1 1 p1 + p1 + p1
//        1 2   p1 + p2
//        3     p3
//
//        4 )
//        1 1 1 1
//        1 1 2
//        1 3  dp[3] + p[1]
//        2 2 p[2] + p[2]
//        4  p[4]
//
//        5)
//        1 1 1 1 1
//        1 1 1 2
//        1 1 3
//        1 2 2
//        1 4 dp[4] + p[1]
//        2 3 p[3] + p[2]
//        5   p[5]


//        6)
//        1 1 1 1 1 1
//        1 1 1 1 2
//        1 1 1 3
//        1 1 2 2
//        1 1 4
//        1 2 3
//        1 5 dp[4] + p[1]

//        2 1 3
//        2 2 2
//        2 4

//        3 3
//        6     p[6]


        // 중복 없이 적은 경우
//        1)
//        1 p1
//
//        2)
//        1 1 p1 + p1
//        2   p2
//
//        3)
//        1 1 1
//        1 2
//        2 1
//        3
//
//        4 )
//        1 1 1 1
//        1 1 2
//        1 2 1
//        2 1 1
//        1 3
//        3 1
//        2 2 p[2] + p[2]
//        4  p[4]
//
//        5)
//        1 1 1 1 1
//        1 1 1 2
//        1 1 2 1
//        1 2 1 1
//        2 1 1 1
//        1 1 3
//        1 3 1
//        3 1 1
//        1 2 2
//        2 1 2
//        2 2 1
//        2 3
//        3 2
//        1 4 dp[4] + p[1]
//        2 3 p[3] + p[2]
//        5   p[5]


//        6)
//        1 1 1 1 1 1
//        1 1 1 1 2
//        1 1 1 3
//        1 1 2 2
//        1 1 4
//        1 2 3
//        1 5 dp[4] + p[1]

//        2 1 3
//        2 2 2
//        2 4

//        3 3
//        6     p[6]

    }

}
