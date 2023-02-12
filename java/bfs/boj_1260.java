package bfs;

import java.io.*;
import java.util.*;

public class boj_1260 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static int vCnt, eCnt, startVertex;

    static int[][] adj;
    static boolean[] isVisited;

    static Queue<Integer> q = new LinkedList<>();

    public static void main(String[] args) throws Exception {

        st = new StringTokenizer(br.readLine());
        // vertex의 개수
        vCnt = Integer.parseInt(st.nextToken());
        // edge의 개수
        eCnt = Integer.parseInt(st.nextToken());
        // 시작 정점
        startVertex = Integer.parseInt(st.nextToken());

        adj = new int[vCnt + 1][vCnt + 1];

        for(int i = 0; i < eCnt; i++){
            st = new StringTokenizer(br.readLine());
            int v1 = Integer.parseInt(st.nextToken());
            int v2 = Integer.parseInt(st.nextToken());

            adj[v1][v2] = 1;
            adj[v2][v1] = 1;
        }

        isVisited = new boolean[vCnt + 1];

        // DFS
        dfs(startVertex);

        Arrays.fill(isVisited, false);
        System.out.println();

        // BFS
        bfs(startVertex);
    }

    private static void dfs(int x) {
        if (isVisited[x]) return;

        isVisited[x] = true;
        System.out.print(x + " ");
        for (int i = 1; i < adj.length; i++){
            if (adj[x][i] == 1) dfs(i);
        }
    }

    private static void bfs(int x) {
        q.offer(x);
        isVisited[x] = true;

        while (!q.isEmpty()){
            x = q.poll();
            System.out.print(x + " ");

            for (int i = 1; i < adj.length; i++){
                if (!isVisited[i] && adj[x][i] == 1){
                    q.offer(i);
                    isVisited[i] = true;
                }
            }
        }
    }
}
