import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class template {

    public static class Pair{ // pair
        int x, y;
        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static List<Integer>[] adj; // 인접리스트

    static int[] dx = {1, 0, -1, 0}; // DFS, BFS
    static int[] dy = {0, 1, 0 ,-1};
    static int[][] map; // 2차원 지도

    public static void main(String[] args) throws IOException {
        input();
        bfs();
    }

    private static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());

        map = new int[N][M];
        for (int i = 0; i < N; i++) {
            String tmp;
            stringTokenizer = new StringTokenizer(br.readLine());
            tmp = stringTokenizer.nextToken();
            for (int j = 0; j < M; j++) {
                map[i][j] = tmp.charAt(j);
            }
        }
    }

    private static void bfs() {
        Queue<int[]> q = new LinkedList<>();

        while (!q.isEmpty()){
            int cur[] = q.poll();
            int x = cur[0];
            int y = cur[1];

            for (int i = 0; i < 4; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];
            }
        }
    }
}
