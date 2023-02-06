package back_tracking;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class boj_15652 {

    // 빠른 입력
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // 빠른 출력
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static StringTokenizer st;

    static int n,m;
    static int[] arr = new int[10];

    public static void main(String[] args) throws Exception{
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        dfs(1, 0);
        bw.flush();
    }

    private static void dfs(int at, int depth) throws IOException {
        if (depth == m){
            for (int i = 0; i < m; i++){
                bw.write(arr[i] + " ");
            }
            bw.newLine();
            return ;
        }

        for (int i = at; i <= n; i++){
            arr[depth] = i;
            dfs(i, depth + 1);
        }
    }
}
