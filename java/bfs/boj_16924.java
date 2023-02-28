package bfs;

import java.io.*;
import java.util.*;

public class boj_16924 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N, M;
    static char[][] map;
    static boolean[][] isVisited;
    static int size = 0;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String args[]) throws IOException {
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        map = new char[N][M];
        isVisited = new boolean[N][M];

        for (int i = 0; i < N; i++){
            String str = br.readLine();
            for (int j = 0; j < M; j++){
                map[i][j] = str.charAt(j);
            }
        }
        //bfs 돌면서



        Queue<int[]> Q = new LinkedList<>();
        // isVisited[0][0] = true;
        // 모든점 돌면서
        for (int i = 0; i < N; i++){
            for (int j = 0; j < M; j++){
                Q.offer(new int[]{i, j});
                BFS(Q, 1);
                size = 0;
            }
        }
        // 중심에서 상하좌우 다 방문 했을때 '*' 있고 길이가 같으면
        // 중심좌표와 길이 출력
    }
    public static void BFS(Queue <int[]>Q, int n){
        while (!Q.isEmpty()){
            int[] cur = Q.poll();
            int x = cur[0];
            int y = cur[1];
            int cnt = 0;
            // 상 하 좌 우
            for (int i = 0; i < 4; i++){
                int nx = x + dx[i] * n;
                int ny = y + dy[i] * n;
                if (nx < 0 || ny < 0 || nx >= N || ny >= M)
                    continue;
                if (map[nx][ny] == '*')
                    cnt++;
            }
            // 상하좌우 다 별이면 (n+1) 한칸 더 확인
            if (cnt == 4){
                size++;
                Q.offer(new int[]{x, y});
                BFS(Q, n+1);
            }
            else return ;
        }
    }
}