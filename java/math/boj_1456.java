package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class boj_1456 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;



    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        // 특정 범위 내의 소수 구하기
        boolean[] isPrime = new boolean[1000001]; // int 범위 벗어나면 못함
        // 1은 소수가 아니다
        isPrime[1] = true;
        for (int i = 2; i <= 1000000; i++)
            // 소수이이면
            if (!isPrime[i])
                // 그 배수들은 모두 제외
                for (int j = i * 2; j<=1000000; j += i)
                    isPrime[j] = true;

        int cnt = 0;
        for (int i = A; i <= B; ++i){
            // 이 사이의 모둔 소수들을 찾고
            // 그 소수들을 순회하면서 B 이하의 값들에서 소수의 N 제곱 있는지 확인
//            long cur =
        }

        System.out.println(cnt);
    }

    private int getLength(long num){
        int cnt = 0;
        while (num != 0){
            cnt++;
            num /= 10;
        }
        return cnt;
    }


}
