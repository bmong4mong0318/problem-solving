package dfs;

import java.io.*;
import java.util.*;

public class boj_10451 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int[] map;
    static boolean[] isVisited;

    public static void dfs(int start){
        // dfs 순회할 다음 노드
        int next = map[start];
        if (!isVisited[next]){
            isVisited[next] = true;
            dfs(next);
        }
    }

    public static void main(String[] args) throws IOException{
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0){
            int n = Integer.parseInt(br.readLine());
            map = new int[n + 1];
            isVisited = new boolean[n + 1];

            st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= n; i++){
                map[i] = Integer.parseInt(st.nextToken());
            }

            int cnt = 0;
            // 모든 노드 돌면서
            for (int i = 1; i <= n; i++){
                // 방문 안한 곳이면
                if (!isVisited[i]){
                    // 방문 처리하고
                    isVisited[i] = true;
                    // 거기서부터 다시 dfs
                    dfs(i);
                    // 한번 쭉 들어갔다 나오면 한 사이클 끝
                    ++cnt;
                }
            }
            System.out.println(cnt);
        }
    }
}
