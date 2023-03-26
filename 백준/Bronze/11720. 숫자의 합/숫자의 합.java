
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
        int N = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        str = st.nextToken();

        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += str.charAt(i) - '0';
        }
        System.out.println(sum);

    }

}