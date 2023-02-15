package recursive;

import java.io.*;
import java.util.*;

public class boj_1992 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    static int N;
    static int[][] map;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];

        for (int i = 0; i < N; i++){
            String str = br.readLine();
            for (int j = 0; j < N; j++){
                map[i][j] = str.charAt(j) - '0';
            }
        }
        quadTree(0, 0, N);
        System.out.println(sb);
    }

    private static void quadTree(int row, int col, int size) {
        if (check(row, col, size)){
            sb.append(map[row][col]);
        }
        else {
            int cut = size / 2;

            sb.append("(");
            quadTree(row, col, cut); // 왼쪽 위
            quadTree(row, col + cut, cut); // 오른쪽 위
            quadTree(row + cut, col, cut); // 왼쪽 아래
            quadTree(row + cut, col + cut, cut); // 오른쪽 아래
            sb.append(")");
        }

    }

    private static boolean check(int row, int col, int size) {
        int tmp = map[row][col];
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                // row + i, col + j
                // 그 지점(row, col)부터 이동해야 함을 주의
                if (tmp != map[row + i][col + j]) return false;
            }
        }
        return true;
    }
}
