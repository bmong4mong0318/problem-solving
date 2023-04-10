import java.io.*;
import java.util.*;
import java.math.*;

import static java.lang.System.exit;

class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    static String str;
    static BigInteger big_a, big_b;
    static int tmp;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int L = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int R = Integer.parseInt(st.nextToken());

        int sum = 0;
        int branch = L;
        int count = 1;

        while (true) {
            //  가지 분기
            count *= 2;
            //  가지 길이 갱신
            branch *= ((double)R/100);
            if (branch <= 5) break;
            // sum 에 더하기
            sum += branch * count;
        }
        System.out.println(sum);
    }
}
