package recursive;

import java.io.*;
import java.util.*;

public class boj_2448 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static int N;
    static char[][] map;

    public static void main(String[] args) throws IOException {

        N = Integer.parseInt(br.readLine());
        map = new char[N + 1][2 * N + 1];
        for (int i = 1; i <= N; i++){
            Arrays.fill(map[i], ' ');
        }

        star(1, N, N);
        printStar();
    }

    private static void printStar() {
        for (int i = 1; i <= N; i++){
            for (int j = 1; j <= 2 * N; j++){
                sb.append(map[i][j]);
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }

    private static void star(int row, int col, int size) {
        // 가장 작은 패턴의 단위
        if (size == 3){
            map[row][col] = '*';
            map[row+1][col+1] = map[row+1][col-1] = '*';
            map[row+2][col-2] = map[row+2][col-1] = map[row+2][col] = map[row+2][col+1] = map[row+2][col+2] = '*';
        }
        else {
            int cut = size / 2;
            star(row, col, cut);
            star(row + cut, col + cut, cut);
            star(row + cut, col - cut, cut);
        }

    }

}
