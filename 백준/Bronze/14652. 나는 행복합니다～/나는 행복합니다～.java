
import java.util.*;
import java.io.*;
import java.math.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N, M, find;
    static String str;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        find = Integer.parseInt(st.nextToken());

        int cnt = 0;
        loop:
        for (int i = 0; i < N; i++){
            for (int j = 0; j < M; j++){
                if (cnt == find){
                    System.out.println(i + " " + j);
                    break loop;
                }
                cnt++;
            }
        }
    }
}
