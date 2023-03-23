
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

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        if (a == b && b == c)
            System.out.println(10_000 + a * 1_000);
        else if (a == b)
            System.out.println(1_000 + a * 100);
        else if (b == c)
            System.out.println(1_000 + b * 100);
        else if (c == a)
            System.out.println(1_000 + a * 100);
        else{
            int max = Math.max(a, Math.max(b, c));
            System.out.println(max * 100);
        }
    }

}

