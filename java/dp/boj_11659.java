package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_11659 {

    static int n;
    static int m;
    static int[] a = new int[100_001];
    static int[] d = new int[100_001];

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        d[0] = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++){
            a[i] = Integer.parseInt(st.nextToken());
            d[i] = d[i -1] + a[i];
        }
        while (m > 0){
            int i;
            int j;
            st = new StringTokenizer(br.readLine());
            i = Integer.parseInt(st.nextToken());
            j = Integer.parseInt(st.nextToken());
            System.out.println(d[j] - d[i-1]);
            m--;
        }
    }

}
