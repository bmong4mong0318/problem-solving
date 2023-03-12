

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static StringBuilder sb;
    static int N, M;
    static int[] arr;
    static int[] ans;
    static boolean[] isUsed;
    static HashSet<String> mem;

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

        sb = new StringBuilder();
        mem = new HashSet<>();
        dfs(0);
        System.out.println(sb);
    }

    private static void dfs(int depth) {
        String str = Arrays.toString(ans)
                .replace("[", "").replace("]", "").replace(",", "");

        if (depth == M){
            if (!mem.contains(str)){
                for(int i = 0; i < M; i++){
                    sb.append(ans[i]).append(" ");
                }
                sb.append("\n");
                mem.add(str);
            }
            return ;
        }

        for (int i = 0; i < N; i++){
            if (!isUsed[i]){
                ans[depth] = arr[i];
                isUsed[i] = true;

                dfs(depth + 1);

                isUsed[i] = false;
            }

        }
    }

}
