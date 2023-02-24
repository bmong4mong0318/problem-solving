package dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class boj_1967 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static ArrayList<Edge>[] adjList;
    static boolean[] isUsed;
    static int max = Integer.MIN_VALUE;

    static class Edge {
        int to;
        int weight;

        Edge(int to, int weight){
            this.to = to;
            this.weight = weight;
        }
    }

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());


        // 가중치를 둔 인접 리스트
        adjList = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            adjList[i] = new ArrayList<>();
        }

        for (int i = 1; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int v1 = Integer.parseInt(st.nextToken());
            int v2 = Integer.parseInt(st.nextToken());
            int G = Integer.parseInt(st.nextToken());

            adjList[v1].add(new Edge(v2, G));
            adjList[v2].add(new Edge(v1, G));
        }

        for (int i = 1; i <= N; i++) {
            isUsed = new boolean[N + 1];
            isUsed[i] = true;
            dfs(i, 0);
        }
        System.out.println(max);
    }

    private static void dfs(int x, int len) {
        // DFS 끝날때 마다 MAX 값 갱신
        if (max < len) {
            max = len;
        }

        // 인접한 노드들을 전부 돌면서
        for (Edge e : adjList[x]){
            int i = e.to;
            int weight = e.weight;

            // 연결되어있으면
            if(!isUsed[i]){
                isUsed[i] = true;
                dfs(i, len + weight);
                isUsed[i] = false;
            }
        }

    }
}
