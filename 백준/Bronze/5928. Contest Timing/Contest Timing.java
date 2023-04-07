import java.io.*;
import java.util.*;

class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb;
    static String str;

    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken()) * 24 * 60;
        int b = Integer.parseInt(st.nextToken()) * 60;
        int c = Integer.parseInt(st.nextToken());
        
        int sum = a + b + c - 11 * 24 * 60 - 11 * 60 - 11;
        if (sum < 0) {
            System.out.println(-1);
        } else System.out.println(sum);
    }
}
