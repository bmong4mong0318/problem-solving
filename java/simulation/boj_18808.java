package simulation;

import java.io.*;
import java.util.*;

public class boj_18808 {

    static int[] dx = {1, 0, -1, 0, 0};
    static int[] dy = {0, 1, 0, -1, 0};
    static ArrayList<int[][]> stickers = new ArrayList<>();
    static int N, M;

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws Exception {

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        int[][] noteBook = new int[N][M];
        int K = Integer.parseInt(st.nextToken());

        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            int R = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());
            int[][] sticker = new int[R][C];
            for (int j = 0; j < R; j++) {
                st = new StringTokenizer(br.readLine());
                for (int k = 0; k < C; k++) {
                    sticker[j][k] = Integer.parseInt(st.nextToken());
                }
            }
            stickers.add(sticker);
        }

        // 스티커 돌면서
        for (int[][] sticker : stickers) {
            isValidSticker(noteBook, sticker);
        }

        // 노트북 돌면서 칠해진 곳 개수 세기
        int ans = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (noteBook[i][j] == 1) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }

    private static void isValidSticker(int[][] noteBook, int[][] sticker) {
        int[][] tmp = sticker;
        int cnt = 3;
        // 4번 돌리기 실패시 다음 스티커
        while (cnt >= 0) {
            // 노트북 돌면서
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    // 스티커가 붙일 수 있다면
                    if (bfs(tmp, noteBook, i, j)) {
                        // 그 위치부터 그 스티커를 노트북에 그리기
                        putSticker(tmp, noteBook, i, j);
                        return ;
                    }
                }
            }
            // 그리기 실패시 스티커 90도 회전
            tmp = rotateSticker(tmp);
            cnt--;
        }
    }

    private static int[][] rotateSticker(int[][] tmp) {
        int row = tmp.length;
        int col = tmp[0].length;
        int[][] new_sticker = new int[col][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                new_sticker[j][row - i - 1] = tmp[i][j];
            }
        }
        return new_sticker;
    }

    private static void putSticker(int[][] sticker, int[][] noteBook, int ni, int nj) {
        int row = sticker.length;
        int col = sticker[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (sticker[i][j] == 1)
                    noteBook[ni + i][nj + j] = sticker[i][j];
            }
        }
    }

    private static boolean bfs(int[][] sticker, int[][] noteBook, int ni, int nj) {
        Queue<int[]> q = new LinkedList<>();

        int row = sticker.length;
        int col = sticker[0].length;

        int cnt = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (sticker[i][j] == 1){
                    cnt++;
                    // 시작점을 조정해줘야 한다.
                    q.offer(new int[]{i, j});
                }
            }
        }

        boolean[][] isVisited = new boolean[row][col];

        while (!q.isEmpty()) {
            int cur[] = q.poll();
            int x = cur[0];
            int y = cur[1];

            for (int i = 0; i < 5; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx < 0 || nx >= row || ny < 0 || ny >= col) {
                    continue;
                }

                if (ni + nx < 0 || ni + nx >= N || nj + ny < 0 || nj + ny >= M) {
                    continue;
                }

                // 스티커가 있으면
                if (sticker[nx][ny] == 1){
                    // 노트북에 자리가 있으면
                    if (!isVisited[nx][ny] && noteBook[ni + nx][nj + ny] == 0) {
                        q.offer(new int[]{nx, ny});
                        isVisited[nx][ny] = true;
                        cnt--;
                    } else if (noteBook[ni + nx][nj + ny] == 1) {
                        return false;
                    }

                }
            }
        }
        if (cnt != 0)
            return false;
        return true;
    }
}
