package bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj_2206 {

    static int[] dx = {1, 0, -1, 0}; // DFS, BFS
    static int[] dy = {0, 1, 0, -1};
    static char[][] map;
    static int[][][] isVisited;
    static int[][] dist;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());

        map = new char[N][M];
        isVisited = new int[N][M][2];
        dist = new int[N][M];

        for (int i = 0; i < N; i++) {
            String tmp;
            stringTokenizer = new StringTokenizer(br.readLine());
            tmp = stringTokenizer.nextToken();
            for (int j = 0; j < M; j++) {
                map[i][j] = tmp.charAt(j);
            }
        }

        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{0, 0});
        isVisited[0][0][0]++;

        while (!q.isEmpty()) {
            int cur[] = q.poll();
            int x = cur[0];
            int y = cur[1];

            if (x == N - 1 && y == M - 1) {
                System.out.println(dist[x][y]);
                return;
            }

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];


                if (nx < 0 || nx >= N || ny < 0 || ny >= M) {
                    continue;
                }

                if (map[nx][ny] == '1'){
                    if (cur[2] == 0 && isVisited[nx][ny][1] == 0){
                        isVisited[nx][ny][cur[2]] = 1;
                        dist[nx][ny] = dist[x][y] + 1;
                        q.offer(new int[]{nx, ny, 1});
                    }
                }
                else {

                }
                if (map[nx] .out.println("nx = " + nx);
//                    System.out.println("ny = " + ny);
//                    System.out.println("@@@");
                    q.add(new int[]{nx, ny});
                    isVisited[nx][ny][0] = isVisited[x][y][0] + 1;
                } else if (map[nx][ny] == '1' && !flag2 && isVisited[nx][ny][0] == -1) {
//                    System.out.println("@@@@@");
                    q.add(new int[]{nx, ny});
                    isVisited[nx][ny][0] = isVisited[x][y][0] + 1;
                    flag = true;
                }
            }
        }
        System.out.println(-1);
    }
}

