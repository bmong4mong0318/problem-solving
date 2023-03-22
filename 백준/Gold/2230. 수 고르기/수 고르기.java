

import java.io.*;
import java.util.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int n, m;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        int[] A = new int[n];

        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(A);

        int min = Integer.MAX_VALUE;

        int en = 0;
        for (int st = 0; st < n; st++) {
            while (en < n && A[en] - A[st] < m) {
                en++;
            }
            if (en == n) {
                break;
            }
            min = Math.min(min, A[en] - A[st]);
        }

        System.out.println(min);

    }

}