package back_tracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_9663 {

    static int cnt = 0;
    static int n = 0;

    static boolean[] isUsed1 = new boolean[40];
    static boolean[] isUsed2 = new boolean[40];
    static boolean[] isUsed3 = new boolean[40];

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());
        func(0);
        System.out.println(cnt);
    }

    static void func(int cur){
        if (cur == n){
            cnt++;
            return ;
        }
        for (int i = 0; i < n; i++){
            if (isUsed1[i] || isUsed2[i + cur] || isUsed3[cur - i + n - 1])
                continue;
            isUsed1[i] = true;
            isUsed2[i + cur] = true;
            isUsed3[cur-i+n-1] = true;
            func(cur + 1);
            isUsed1[i] = false;
            isUsed2[i + cur] = false;
            isUsed3[cur-i+n-1] = false;
        }
    }

}
