package back_tracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_15649 {

    static int n;
    static int m;
    static int[] arr = new int[10];
    static boolean[] isUsed = new boolean[10];
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        solution(0);
    }

    private static void solution(int k) {
        if (k == m){
            for (int i = 0; i < m; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return ;
        }
        for (int i = 1; i <= n; i++){
            if (!isUsed[i]){
                arr[k] = i;
                isUsed[i] = true;
                solution(k+1);
                isUsed[i] = false;
            }
        }
    }

}
