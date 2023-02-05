package simulation;

import java.io.*;
import java.util.*;

public class boj_18808 {


    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    static ArrayList<int[][]> stickers = new ArrayList<>();

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    public static void main(String[] args) throws Exception{

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        for (int i = 0; i < K; i++){
            st = new StringTokenizer(br.readLine());
            int R = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());
            int[][] sticker = new int[R][C];
            for (int j = 0; j < R; j++){
                st = new StringTokenizer(br.readLine());
                for (int k = 0; k < C; k++){
                    sticker[j][k] = Integer.parseInt(st.nextToken());
                }
            }
            stickers.add(sticker);
        }

        // 노트북 돌면서
        int [][] noteBook = new int[N][M];
        for (int i = 0; i < N; i++){
            for (int j = 0; j < M; j++){
                // 스티커 BFS
                    // 1이면, 그 방향으로 노트북에 그리기
                // 동시에 노트북에 스티커 그리기
                    // 그리기 실패시 스티커 90도 회전
                    // 4번 돌리기 실패시 다음 스티커

            }
        }
    }

}
