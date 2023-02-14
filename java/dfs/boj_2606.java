package dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_2606 {


    // 빠른 입력
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int[][] adj;
    static int n, s;
    static int cnt = 0;
    static boolean[] isVisited;

    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());
        s = Integer.parseInt(br.readLine());

        isVisited = new boolean[n + 1];
        adj = new int[n+1][n+1];
        for (int i = 0; i < s; i++){

            st = new StringTokenizer(br.readLine());
            int v1 = Integer.parseInt(st.nextToken());
            int v2 = Integer.parseInt(st.nextToken());
            adj[v1][v2] = 1;
            adj[v2][v1] = 1;
        }
        dfs(1);
        System.out.println(cnt - 1);
    }

    private static void dfs(int x) {

        if (!isVisited[x]){
            isVisited[x] = true;
            cnt++;

            for (int i = 1; i < adj.length; i++){
                if (adj[x][i] == 1) dfs(i);
            }
        }
    }

}
