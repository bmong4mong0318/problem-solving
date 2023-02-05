package math;


import java.io.*;
import java.util.*;

public class boj_1850 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static long a, b;

    public static void main(String[] args) throws Exception{
        st = new StringTokenizer(br.readLine());
        a = Long.parseLong(st.nextToken());
        b = Long.parseLong(st.nextToken());
        long mGcd = gcd(Math.max(a, b), Math.min(a,b));

        String result = "1".repeat((int) mGcd);

        System.out.println(result);
    }

    public static long gcd(long a, long b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

}
