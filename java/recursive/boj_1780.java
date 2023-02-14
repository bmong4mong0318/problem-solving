package recursive;

import java.io.*;
import java.util.*;

public class boj_1780 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int n;
    static int[][] map;

    public static int MINUS = 0;
    public static int ZERO = 0;
    public static int ONE = 0;

    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());

        map = new int[n][n];
        for (int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        cutPaper(0, 0, n);

        System.out.println(MINUS);
        System.out.println(ZERO);
        System.out.println(ONE);
    }

    public static boolean colorCheck(int row, int col, int size) {
        int color = map[row][col];

        for (int i = row; i < row + size; i++) {
            for (int j = col; j < col + size; j++) {
                if (color != map[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    private static void cutPaper(int row, int col, int len) {
        if (colorCheck(row, col, len)) {
            if(map[row][col] == -1) MINUS++;
            else if(map[row][col] == 0) ZERO++;
            else ONE++;
            return;
        }

        int newLen = len / 3;

        cutPaper(row, col, newLen);
        cutPaper(row, col + newLen, newLen);
        cutPaper(row, col + 2 * newLen, newLen);

        cutPaper(row + newLen, col, newLen);
        cutPaper(row + newLen, col + newLen, newLen);
        cutPaper(row + newLen, col + 2 * newLen, newLen);

        cutPaper(row + 2 * newLen, col, newLen);
        cutPaper(row + 2 * newLen, col + newLen, newLen);
        cutPaper(row + 2 * newLen, col + 2 * newLen, newLen);

    }

}
