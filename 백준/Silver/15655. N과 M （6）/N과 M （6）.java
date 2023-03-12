

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
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
        ans = new int[N];
        isUsed = new boolean[10_001];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        dfs(0, 0);
    }

    private static void dfs(int at, int depth) {
        if (depth == M){
            for(int i = 0; i < M; i++){
                System.out.print(ans[i] + " ");
            }
            System.out.println();
        }

        for (int i = at; i < N; i++){
            if (!isUsed[arr[i]]){

                isUsed[arr[i]] = true;
                ans[depth] = arr[i];

                dfs(i + 1, depth + 1);

                isUsed[arr[i]] = false;
                ans[depth] = 0;
            }
        }
    }
}
