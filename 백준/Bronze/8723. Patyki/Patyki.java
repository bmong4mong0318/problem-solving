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

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int max = Math.max(a, Math.max(b, c));
        int min = Math.min(a, Math.min(b, c));
        int mid = a + b + c - max - min;
        
        if (a == b && b == c)
            System.out.println(2);
        else if (Math.pow(max, 2) == Math.pow(min, 2) + Math.pow(mid, 2))
            System.out.println(1);
        else
            System.out.println(0);
    }
}
