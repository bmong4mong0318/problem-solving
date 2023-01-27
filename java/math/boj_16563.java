package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_16563 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    // 2~5,000,000 사이의 소수를 미리 모두 구해놓고
    // 2 ~ ki 사이의 소수를 돌면서
    // 나눠질때까지 나누고 출력, 그 다음 소수로 넘어가기
    // 더 안나누어지면 stop

    public static void main(String[] args) throws IOException {

        // 특정 범위 내의 소수 구하기
        boolean[] isNotPrime = new boolean[5_000_001]; // int 범위 벗어나면 못함
        // 1은 소수가 아니다
        isNotPrime[1] = true;
        for (int i = 2; i <= 5_000_000; i++)
        {
            // 소수이이면
            if (!isNotPrime[i])
            // 그 배수들은 모두 제외
            {
                for (int j = i * 2; j <= 5_000_000; j += i) {
                    isNotPrime[j] = true;
                }
            }
        }

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++){
            Integer num = Integer.parseInt(st.nextToken());
            printPrime(num);
        }
    }

    private static void printPrime(Integer num) {
        for (int i = 2; i <= 4; i++) {
            divideByPrime(num, i);
            System.out.println("i = " + i);
            System.out.println("num = " + num);
            // divideByPrime에서 i로 계속 나누는데 왜 num이 안바뀌냐
            if (num == 0) break;
        }
        System.out.println();
    }

    private static void divideByPrime(Integer num, int i) {
        if (num % i == 0){
            num /= i;
            System.out.print(i + " ");
            divideByPrime(num, i);
        }
    }

}
