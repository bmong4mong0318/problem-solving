package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj_2217 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());

        int[] rope = new int [N];

        for (int i = 0; i < N; i++){
            rope[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(rope);

        int max = 0;
        for (int i = 0; i < N; i++){
            max = Math.max(max, rope[i] * (N - i));
        }
        System.out.println(max);
    }

}
