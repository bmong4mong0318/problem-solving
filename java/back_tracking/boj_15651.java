package back_tracking;

import java.io.*;
import java.util.*;

public class boj_15651 {

    // 빠른 입력
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // 빠른 출력
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;

//    static StringBuilder sb = new StringBuilder();

    static int n,m;
    static int[] arr = new int[10];

    public static void main(String[] args) throws Exception{
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        dfs(0);
//        System.out.println(sb);
        bw.flush();
    }

    private static void dfs(int depth) throws IOException {
        if (depth == m){
            for (int i = 0; i < m; i++){
                bw.write(arr[i] + " ");
//                sb.append(arr[i] + " ");
            }
            bw.newLine();
//            sb.append('\n');
            return ;
        }

        for (int i = 1; i <= n; i++){
            arr[depth] = i;
            dfs(depth + 1);
        }
    }

}
