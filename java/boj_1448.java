import java.io.*;
import java.util.*;

public class boj_1448 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int[] arr;
    static int[] tri;
    static boolean[] isUsed;
    static int max = 0;
    static int len = 0;

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());

        tri = new int[N];
        isUsed = new boolean[N];
        for (int i = 0; i < N; i++){
            tri[i] = Integer.parseInt(br.readLine());
        }

        dfs(0, 0);
    }

    private static void dfs(int at, int depth) {
        if (depth == 3){
            // 제일 긴 변
            int c = Math.max(arr[0], Math.max(arr[1], arr[2]));
            // 제일 짧은 변
            int a = Math.min(arr[0], Math.min(arr[1], arr[2]));

            // c > a + b 이면
            // max = Math.max(max, a + b + c)
            // return ;
            // else
        }

        arr[depth] = tri[at];

        for (int i = at; i <tri.length; i++) {
            isUsed[i] = true;
            dfs(at + 1, depth + 1);
        }
    }

}
