package simulation;

import java.io.*;
import java.util.*;

public class boj_12100 {

    // 빠른 입력
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // 빠른 출력
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    // 버퍼를 잡아 놓았기 때문에 bw.flush(); 를 반드시 호출 해주어야 한다.
    // bw.write(String.valueOf(result)); // 종료시마다 결과 값 버퍼에 저장
    // bw.flush(); // 출력

    static StringTokenizer st;

    static int n;
    static int[][] board;
    static int ans = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        board = new int[n][n];


        for (int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++){
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        dfs(0, board);
    }
    private static void dfs(int cnt, int[][] board) {
        if (cnt == 5){
//            ans = Math.min(ans, getMaxBlock());
        }

    }
}
