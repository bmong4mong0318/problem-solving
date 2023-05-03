import java.io.*;
import java.util.*;
import java.math.*;

class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    static String str;
    static BigInteger big_a, big_b;

    public static void main(String[] args) throws IOException {

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            int c = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());

            sb = new StringBuilder();
            for (int j = 0; j < r; j++){
                for(int k = 0; k < c; k++){
                    sb.append("X");
                }
                sb.append("\n");
            }
            System.out.println(sb);
        }
    }
}
