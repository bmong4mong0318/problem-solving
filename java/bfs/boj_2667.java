package bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj_2667 {


    // 빠른 입력
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int n;
    static int[][] map;
    static boolean[][] isVisited;
    static int total = 0;
    static ArrayList<Integer> houseCount;

    static int[] dx = {1, 0, -1, 0, 0};
    static int[] dy = {0, 1, 0, -1, 0};

    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());

        map = new int[n][n];
        isVisited = new boolean[n][n];
        houseCount = new ArrayList<>();

        for (int i = 0; i < n; i++){
            String str = br.readLine();
            for (int j = 0; j < n; j++){
                map[i][j] = str.charAt(j)-'0';
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] == 1 && !isVisited[i][j])
                    bfs(i, j);
            }
        }
        System.out.println(total);
        Collections.sort(houseCount);
        for (Integer integer : houseCount) {
            System.out.println(integer);
        }
    }

    private static void bfs(int a, int b) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{a, b});
        int cnt = 0;
        
        while (!q.isEmpty()){
            int cur[] = q.poll();
            int x = cur[0];
            int y = cur[1];

            for (int i = 0; i < 5; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx < 0 || nx >= n || ny < 0 || ny >= n)
                    continue;

                if (map[nx][ny] == 1 && !isVisited[nx][ny]){
                    q.offer(new int[]{nx, ny});
                    isVisited[nx][ny] = true;
                    cnt++;
                }
            }
        }
        total += 1;
        houseCount.add(cnt);
    }
}
