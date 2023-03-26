
import java.io.*;
import java.util.*;
import java.math.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static String str;
    static StringBuilder sb;
    static int[][] map = new int[10][10];
    static int[][] tmp = new int[10][10];

    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        sb = new StringBuilder();
        for (int i = 0; i < a; i++) {
            str = br.readLine();
            for (int j = 0; j < b; j++) {
                map[i][j] = str.charAt(j) - '0';
                tmp[i][j] = str.charAt(j) - '0';
            }
        }

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                sb.append(tmp[i][b - j - 1]);
            }
            sb.append('\n');
        }
        
        System.out.println(sb);
    }

}