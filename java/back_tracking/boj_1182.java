package back_tracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_1182 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N;
    static int S;
    static int cnt = 0;
    static int[] num = new int[21];

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++)
            num[i] = Integer.parseInt(st.nextToken());
        func(0, 0);
        if (S == 0) cnt--;
        System.out.println(cnt);
    }

    public static void func(int cur, int tot){
        // 단계가 끝났을때의 합이 S이면 카운트
        if (cur == N){
            if (tot == S) cnt++;
            return;
        }
        func(cur + 1, tot); // cur 위치의 수를 안더하고 다음 단계로
        func(cur + 1, tot + num[cur]); // 더하고 다음 단계로
    }

}
