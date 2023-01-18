package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_16134 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());

        long N = Long.parseLong(st.nextToken());
        long R = Long.parseLong(st.nextToken());

//        nCr = (n-r)! / r!

        long up = 1;

        for (int i = 1; i <= R; i++){
            up *= N - i + 1;
            long down = i;

            float tmp = up / down;
            long tmp2 = (long)tmp;

            if (tmp - tmp2 == 0)
                up /= down;

        }

        System.out.println(up % 1_000_000_007);
    }
}
