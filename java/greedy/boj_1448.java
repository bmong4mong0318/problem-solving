package greedy;

import java.io.*;
import java.util.*;

public class boj_1448 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int[] tri;
    static boolean[] isUsed;

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());

        tri = new int[N];
        isUsed = new boolean[N];
        for (int i = 0; i < N; i++){
            tri[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(tri);

        for (int i = 0; i < N - 2; i++){
            int a = tri[N - 1 - i];
            int b = tri[N - 2 - i];
            int c = tri[N - 3 - i];

            if (a < b + c) {
                System.out.println(a + b + c);
                return ;
            }
        }
        System.out.println(-1);
    }
}
