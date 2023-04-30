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

        int N = Integer.parseInt(st.nextToken());

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            int W = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            System.out.println((W*K)/2);
        }
    }
}
