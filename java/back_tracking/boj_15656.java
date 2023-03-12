package back_tracking;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj_15656 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int N, M;
    static int[] arr;
    static boolean[] isUsed;
    static int[] ans;
    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N];
        ans = new int[M];
        isUsed = new boolean[10_001];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        dfs(0, 0);
        bw.flush();
    }

    private static void dfs(int at, int depth) throws IOException {
        if (depth == M){
            for(int i = 0; i < M; i++){
                bw.write(ans[i] + " ");
            }
            bw.newLine();
            return ;
        }

        for (int i = at; i < N; i++){
            ans[depth] = arr[i];
            dfs(i + 1, depth + 1);
        }
    }
}
