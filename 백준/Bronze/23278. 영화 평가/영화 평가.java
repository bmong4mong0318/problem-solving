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

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] score = new int[N];
        for (int i = 0; i < score.length; i++) {
            score[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(score);

        for (int i = 0 ; i < L; i++){
            score[i] = 0;
        }

        for (int i = 0; i < H; i++){
            score[score.length - 1 - i] = 0;
        }

        int sum = 0;
        for (int i : score) {
            sum += i;
        }

        System.out.println((double)sum / (N - L - H));
    }
}
