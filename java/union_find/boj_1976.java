package union_find;

import java.io.*;
import java.util.*;

public class boj_1976 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N,M;
    static int[] parents;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());

        parents = new int[N + 1];
        for (int i = 1; i <= N; i++){
            parents[i] = i;
        }

        for (int i = 1; i <= N; i++){
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= N; j++){
                int link = Integer.parseInt(st.nextToken());
                // 연결되어 있으면 합치기
                if (link == 1) union(i, j);
            }
        }

        st = new StringTokenizer(br.readLine());
        int start = find(Integer.parseInt(st.nextToken()));
        for (int i = 1; i < M; i++){
            int now = Integer.parseInt(st.nextToken());
            if (start != find(now)){
                System.out.println("NO");
                return ;
            }
        }
        System.out.println("YES");
    }

    private static boolean union(int a, int b) {
        int aRoot = find(a);
        int bRoot = find(b);

        if (aRoot == bRoot) return true;
        // aRoot와 bRoot가 다른 경우
        else{
            if (aRoot < bRoot) {
                parents[bRoot] = aRoot;
            } else {
                parents[aRoot] = bRoot;
            }
            return false;
        }
    }

    private static int find(int n) {
        if (n == parents[n]) return n;
        return parents[n] = find(parents[n]);
    }
}
