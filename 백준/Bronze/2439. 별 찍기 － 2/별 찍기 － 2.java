
import java.io.*;
import java.util.*;
import java.math.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static String str;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());

        for(int i = 1; i <= N; i++){
            for (int j = 0; j < N - i; j++){
                sb.append(" ");
            }
            for (int j = 0; j < i; j++){
                sb.append("*");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }

}

