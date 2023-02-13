package greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj_11399 {

    // 빠른 입력
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N;
    static int[] P;
    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        P = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++){
            P[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(P);

        int[] dp = new int[N + 1];
        dp[0] = 0;
        for (int i = 1; i <= N; i++){
            dp[i] = dp[i - 1] + P[i - 1];
        }
        int sum = 0;
        for (int i : dp) {
            sum += i;
        }

        System.out.println(sum);
    }

}
