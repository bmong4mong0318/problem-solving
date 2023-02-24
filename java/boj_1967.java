import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_1967 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int[][] map;
    static boolean[] isUsed;
    static int max = Integer.MIN_VALUE;
    static int dia = 0;

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());

        //가중치를 둔 인접 행렬
        map = new int[N + 1][N + 1];
        for (int i = 1; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int v1 = Integer.parseInt(st.nextToken());
            int v2 = Integer.parseInt(st.nextToken());
            int G = Integer.parseInt(st.nextToken());

            map[v1][v2] = G;
            map[v2][v1] = G;
        }

        for (int i = 1; i <= N; i++){
            isUsed = new boolean[N + 1];
            dia = 0;
            dfs(i);
        }
        System.out.println(max);
    }

    private static void dfs(int x) {
        // DFS 끝날때 마다 MAX 값 갱신
        if (isUsed[x]) {
            max = Math.max(max, dia);
            return;
        }

        isUsed[x] = true;
        for (int i = 1; i < map.length; i++) {
            if (map[x][i] != 0) { // 연결되어있으면
                dia += map[x][i];
                dfs(i);
                dia -= map[x][i];
            }
        }
    }
}