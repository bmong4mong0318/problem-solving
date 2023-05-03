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

        int sum  = 0;
        while ((str = br.readLine()) != null) {
            int a = Integer.parseInt(str);
            if (a < 40){
                a = 40;
            }
            sum += a;
        }
        System.out.println(sum / 5);
    }
}
