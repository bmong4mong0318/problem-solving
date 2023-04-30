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
            System.out.println("Hello World, Judge " + (i+1) + "!");
        }
    }
}
