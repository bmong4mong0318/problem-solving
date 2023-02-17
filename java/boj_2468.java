import java.io.*;
import java.util.*;

public class boj_2468 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int[][] map;
    static boolean[][] isVisited;
    static int N;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int max_rain = Integer.MIN_VALUE;
    static int max_safe = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException {

        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        isVisited = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                // 최대 강수량 구하기
                max_rain = Math.max(max_rain, map[i][j]);
            }
        }

        // 최대값 까지 강수량 높여가면서 BFS
        for (int rain = 0; rain <= max_rain; rain++){
            isVisited = new boolean[N][N];
            int cnt = 0;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    // 무작정 다 안돌리고 조건 걸어주면 조금이라도 빨라진다
                    if (!isVisited[i][j] && map[i][j] > rain)
                        cnt += bfs(i, j, rain);
                }
            }
            max_safe = Math.max(max_safe, cnt);
        }
        System.out.println(max_safe);
    }

    private static int bfs(int a, int b, int rain) {
        Queue<int []> Q = new LinkedList<>();
        // 항상 세트로 생각하자
        Q.offer(new int[] {a, b}); // 큐에 넣고
        isVisited[a][b] = true; // 방문체크 하고

        while (!Q.isEmpty()){
            int[] cur = Q.poll();
            int x = cur[0];
            int y = cur[1];

            for (int i = 0; i < 4; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx < 0 || ny < 0 || nx >= N || ny >= N){
                    continue;
                }

                if (map[nx][ny] > rain && !isVisited[nx][ny]){
                    Q.offer(new int[]{nx, ny});
                    isVisited[nx][ny] = true;
                }
            }
        }
        return 1;
    }
}
