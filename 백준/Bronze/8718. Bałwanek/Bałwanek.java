import java.io.*;
import java.util.*;
import java.math.*;
import java.util.stream.Stream;

class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    static String str;
    static BigInteger big_a, big_b;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int a, b, c = 0;
        a = 1000*k + 2000*k + 4000*k;
        b = 500*k + 1000*k + 2000*k;
        c = 250*k + 500*k + 1000*k;

        if (a > x * 1000)
            a = 0;
        if (b > x * 1000)
            b = 0;
        if (c > x * 1000)
            c = 0;

        System.out.println(Math.max(a, Math.max(b, c)));
    }
}
