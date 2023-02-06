package math;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj_5636 {

    // 빠른 입력
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // 빠른 출력
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    // 버퍼를 잡아 놓았기 때문에 bw.flush(); 를 반드시 호출 해주어야 한다.
    static StringTokenizer st;
    static ArrayList<Integer> primeNumbers = getPrimeNumbers(100_000);

    public static void main(String[] args) throws IOException {

        while (true) {
            st = new StringTokenizer(br.readLine());
            String str = String.valueOf(st.nextToken());
            if (str.equals("0")) break;
            findPrimeFromString(str);
        }
    }

    private static void findPrimeFromString(String numStr) throws IOException {
        int len = numStr.length();
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len + 1; j++) {
                // 최대 5자리
                String checkLen = numStr.substring(i, j);
                if (checkLen.length() > 5) {
                    continue;
                }

                int subStr = Integer.parseInt(numStr.substring(i, j));
                for (Integer prime : primeNumbers) {
                    if (prime == subStr) {
                        max = Math.max(max, subStr);
                    }
                }
            }
        }
        System.out.println(max);
//        bw.write(max);
//        bw.newLine();
//        bw.flush();
    }

    private static ArrayList<Integer> getPrimeNumbers(int LIMIT) {
        ArrayList<Integer> prime = new ArrayList<>();
        boolean[] isPrime = new boolean[LIMIT + 1]; // int 범위 벗어나면 못함

        //처음에 모두 소수라고 가정
        Arrays.fill(isPrime, true);
        //2 부터 sqrt(n) 까지
        for (int i = 2; i * i <= LIMIT; i++) {
            // 이미 지워진 수는 무시
            if (!isPrime[i]) {
                continue;
            }

            //소수만 모으고
            prime.add(i);
            for (int j = i * i; j <= LIMIT; j += i) {
                // 그 배수들은 모두 제외
                isPrime[j] = false;
            }
        }

        //소수 모으기
        for (int i = 2; i <= LIMIT; i++) {
            if (isPrime[i]) {
                prime.add(i);
            }
        }
        return prime;
    }

}
