package dfs;


import java.io.*;
import java.util.*;

public class boj_2644 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int n, m;
    static int a, b;
    static int[][] map;
    static boolean[] isVisited;
    static boolean flag;
    static int ans = 0;

    public static void main(String args[]) throws IOException {
        n = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());

        m = Integer.parseInt(br.readLine());

        map = new int[n + 1][n + 1];
        isVisited = new boolean[n + 1];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int v1 = Integer.parseInt(st.nextToken());
            int v2 = Integer.parseInt(st.nextToken());

            map[v1][v2] = 1;
            map[v2][v1] = 1;
        }

        dfs(a, 0);

        if (!flag) {
            System.out.println(-1);
        } else {
            System.out.println(ans);
        }
    }

    static void dfs(int x, int cnt) {

        if (x == b) {
            flag = true;
            ans = cnt;
            return;
        }

        if (!isVisited[x]) {
            isVisited[x] = true;

            for (int i = 1; i < map.length; i++) {

                if (map[x][i] == 1) {
                    dfs(i, cnt + 1);
                }

                if (flag == true) {
                    break;
                }
            }
        }
    }

}


