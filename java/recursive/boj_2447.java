package recursive;

import java.io.*;
import java.util.*;

public class boj_2447 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static int N;
    static char[][] map;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        map = new char[N][N];
        for (int i = 0; i < N; i++){
            Arrays.fill(map[i], ' ');
        }

        solution(0, 0, N);

        for (int i = 0; i < N; i++){
            for (int j = 0; j < N; j++){
                sb.append(map[i][j]);
            }
            sb.append("\n");
        }
        System.out.println(sb);

    }

    private static void solution(int row, int col, int size) {
        if (size == 3){
            map[row][col] = map[row][col+1] = map[row][col+2] = '*';
            map[row+1][col] = map[row+1][col+2] = '*';
            map[row+2][col] = map[row+2][col+1] = map[row+2][col+2] = '*';
        }
        else {
            int cut = size / 3;

            solution(row, col, cut);
            solution(row, col + cut, cut);
            solution(row, col + cut * 2, cut);

            solution(row + cut, col, cut);
            solution(row + cut, col + cut * 2, cut);

            solution(row + cut * 2, col, cut);
            solution(row + cut * 2, col + cut, cut);
            solution(row + cut * 2, col + cut * 2, cut);
        }
    }

}
