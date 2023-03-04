import java.util.*;
import java.io.*;

public class boj_11057 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int n;
    static int[][] dp = new int[1001][2];
    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());

        dp = new int[n+1][10];

        //초기값
        Arrays.fill(dp[1], 1);

        for (int i = 2; i <= n; i++){

            for (int j = 0; j < 10; j++){

            }
        }





        int sum = 0;
        for (int i = 0; i < 10; i++){
            sum += dp[n][i];
        }

        System.out.println(sum % 10007);
    }

}
