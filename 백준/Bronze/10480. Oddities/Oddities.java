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

            for (int i = 0; i < N; i++){
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());

                if (a % 2 == 0)
                    System.out.println(a + " is even");
                else System.out.println(a + " is odd");
            }
    }
}
