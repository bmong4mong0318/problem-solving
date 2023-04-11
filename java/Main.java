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
        int N = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        str = st.nextToken();

        long sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                int cnt = 0;
                StringBuilder make_num = new StringBuilder();
                // 숫자 아닐때까지
                while (i < str.length()
                        && Character.isDigit(str.charAt(i))) {
                    make_num.append((str.charAt(i)));
                    i++;
                    cnt++;
                }
                // sum 에 더하기
                sum += Integer.parseInt(make_num.toString());
            }
        }
        System.out.println(sum);
    }
}
