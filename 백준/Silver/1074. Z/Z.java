

import java.io.*;
import java.util.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static int N, r, c;
    static int cnt = 0;
    static int ans = 0;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        int size = (int) Math.pow(2, N);
        z(0, 0, size);
    }

    private static void z(int row, int col, int size) {
        if (size == 2){

            int n_row = row;
            int n_col = col;
            cnt++;
            if (n_row == r && n_col == c){
                ans = cnt - 1;
                System.out.println(ans);
                System.exit(0);
            }

            n_row = row;
            n_col = col+1;
            cnt++;
            if (n_row == r && n_col == c){
                ans = cnt - 1;
                System.out.println(ans);
                System.exit(0);
            }

            n_row = row+1;
            n_col = col;
            cnt++;
            if (n_row == r && n_col == c){
                ans = cnt - 1;
                System.out.println(ans);
                System.exit(0);
            }

            n_row = row+1;
            n_col = col+1;
            cnt++;
            if (n_row == r && n_col == c){
                ans = cnt - 1;
                System.out.println(ans);
                System.exit(0);
            }

        }else {
            int cut = size / 2;
            if (r < row + cut && c < col + cut){ // 1사분면
                z(row, col, cut);
            }
            if (r < row + cut && col + cut <= c){ // 2사분면
                cnt += (size * size / 4);
                z(row, col + cut, cut);
            }
            if (row + cut <= r && c < col + cut){ // 3사분면
                cnt += 2 * (size * size / 4);
                z(row + cut, col, cut);
            }
            if (row + cut <= r && col + cut <= c){ // 4사분면
                cnt += 3 * (size * size / 4);
                z(row + cut, col + cut, cut);
            }
        }
    }

}
