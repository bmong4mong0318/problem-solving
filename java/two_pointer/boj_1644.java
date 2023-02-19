package two_pointer;

import java.io.*;
import java.util.*;

public class boj_1644 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<Integer> primeNumbers;

    public static void main(String[] args) throws IOException {

        int N = Integer.parseInt(br.readLine());

        primeNumbers = getPrimeNumbers(4_000_000);
        int size = primeNumbers.size();

        int st = 0;
        int en = 0;
        int cnt = 0;

        while (true) {
            int sum = hap(st, en);
            if (sum == N) {
                cnt++;
                en++;
            }
            if (sum < N) en++;
            if (sum > N) st++;

            if (en == size || st == size || st > en){
                break;
            }

        }
        System.out.println(cnt);
    }

    private static int hap(int st, int en) {
        int sum = 0;
        for (int i = st; i <= en; i++) {
            sum += primeNumbers.get(i);
        }
        return sum;
    }

    private static ArrayList<Integer> getPrimeNumbers(int LIMIT) {
        ArrayList<Integer> primeNumbers = new ArrayList<>();
        boolean[] prime = new boolean[LIMIT + 1]; // int 범위 벗어나면 못함
        // 10 억 개의 배열을 만드는건 안된다. -> OutOfMemoryError: Java heap space

        // 소수가 아니면 true
        prime[0] = prime[1] = true;
        // 2 부터 sqrt(n) 까지
        for (int i = 2; i * i <= LIMIT; i++) {
            // 소수이면
            if (!prime[i]) {
                for (int j = i * i; j <= LIMIT; j += i) {
                    // 그 배수들은 모두 제외
                    prime[j] = true;
                }
            }
        }

        // 소수 남김없이 다 모으기
        for (int i = 0; i <= LIMIT; i++) {
            if (!prime[i]) {
                primeNumbers.add(i);
            }
        }
        return primeNumbers;
    }

}
