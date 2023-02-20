
import java.io.*;

public class boj_2011 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int[][] dp;

    public static void main(String[] args) throws Exception {
        String N_str = br.readLine();

        // N자리 암호를 알파벳으로 표현하는 경우의 수
        dp = new int[N_str.length() + 1][2];

        dp[0][0] = 0; // 앞에랑 결합 x
        dp[0][1] = 0; // 앞에랑 결합
        dp[1][0] = 1;
        dp[1][1] = 1;

        if (N_str.contains("-")) {
            System.out.println("0");
            return ;
        }
        if (N_str.length() == 1){
            if (N_str.equals("0")) {
                System.out.println(0);
            } else {
                System.out.println(1);
            }
            return ;
        }

        for (int j = 1; j < N_str.length(); j++) {
            dp[j][0] = dp[j-1][0] + dp[j-1][1];
            dp[j][1] = dp[j-1][0] + oneOrZero(N_str.charAt(j-1), N_str.charAt(j));

            dp[j][0] %= 1000000;
            dp[j][1] %= 1000000;
        }

//        for (int j = 1; j <= N_str.length(); j++){
//            System.out.println("j = " + j);
//            System.out.println("dp[j][0] = " + dp[j][0]);
//            System.out.println("dp[j][1] = " + dp[j][1]);
//        }

        if ((dp[N_str.length() - 1][0] + dp[N_str.length() - 1][1]) % 1000000 == 0) {
            System.out.println("0");
        } else System.out.println((dp[N_str.length()-1][0] + dp[N_str.length()-1][1])%1000000);
    }

//    private static int plusOrNot(char c) {
//        if (Integer.parseInt(String.valueOf(c)) > 0)
//            return 1;
//        else return 0;
//    }

    private static int oneOrZero(char c1, char c2) {
        StringBuilder sb = new StringBuilder();
        sb.append(c1);
        sb.append(c2);
        if (Integer.parseInt(String.valueOf(sb)) >= 1
            && Integer.parseInt(String.valueOf(sb)) <= 26)
            return 1;
        else if (Integer.parseInt(String.valueOf(c2)) > 2)
            return 1;
        else return 0;
    }
}
