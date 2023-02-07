package dp;

import java.io.*;
import java.util.*;

public class boj_1932 {

    // 빠른 입력
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int n;
    static int[][] arr;
    static Integer[][] dp;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());

        arr = new int[n][n];
        dp = new Integer[n][n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j <= i; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 마지막줄 복사
        for (int i = 0; i < n; i++){
            dp[n - 1][i] = arr[n - 1][i];
        }
        System.out.println(find(0, 0));
    }

    static int find(int depth, int idx) {
        // 마지막 행일 경우 현재 위치의 dp값 반환
        if(depth == n - 1) return dp[depth][idx];

        // 탐색하지 않았던 값일 경우 다음 행의 양쪽 값 비교
        if (dp[depth][idx] == null) {
            /*
            바로 다음행의 인덱스와 그 오른쪽의 인덱스 중
            큰 값 찾아 dp에 현재 인덱스의 값과 더하여 저장
            */
            dp[depth][idx] = Math.max(find(depth + 1, idx), find(depth + 1, idx + 1)) + arr[depth][idx];
        }
        return dp[depth][idx];

    }

}

