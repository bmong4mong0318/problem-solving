
import java.io.*;
import java.util.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        long ans[] = new long[T];

        for (int n = 0; n < T; n++) {

            // input
            int N = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            int[] stocks = new int[N];
            for (int i = 0; i < N; i++) {
                stocks[i] = Integer.parseInt(st.nextToken());
            }

            // solution
            int max = 0;
            for (int i = N - 1; i >= 0; i--) {
                if (stocks[i] > max) {
                    max = stocks[i];
                } else {
                    ans[n] += (max - stocks[i]);
                }
            }
        }

        for (long i : ans) {
            System.out.println(i);
        }
    }
}


