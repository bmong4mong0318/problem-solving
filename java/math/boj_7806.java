package math;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj_7806 {

    // 빠른 입력
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // 빠른 출력
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    // 버퍼를 잡아 놓았기 때문에 bw.flush(); 를 반드시 호출 해주어야 한다.
    // bw.write(String.valueOf(result)); // 종료시마다 결과 값 버퍼에 저장
    // bw.flush(); // 출력

    static StringTokenizer st;
    static ArrayList<Integer> primeNumbers;
//    static int[] a_mem = new int[100_000];
    static int[] b_mem = new int[100_000];
    static ArrayList<Integer> b_case = new ArrayList<>();
//    static long a, b;

    public static void main(String[] args) throws Exception {
        primeNumbers = getPrimeNumbers(1_000_000_000);
        System.out.println("check");
        while (true){
            String s = br.readLine();
            if (s.equals("")) break;

            st = new StringTokenizer(s);
            long a = Long.parseLong(st.nextToken());
            long b = Long.parseLong(st.nextToken());
//            System.out.println("check");

            countB(b);
            makePrimeCase();
            for (Integer integer : b_case) {
                System.out.println("integer = " + integer);
            }
            System.out.println(findGCD(a, b));
        }
    }

    private static void makePrimeCase() {

        for (int i = 0; i < b_mem.length; i++){
            if (b_mem[i] != 0){
                while (b_mem[i] > 0){
                    b_case.add(i);
                    b_mem[i]--;
                }
            }
        }
    }

    private static long findGCD(long a, long b) {
        long sum = 1;
        for (long i = a; i > 0; i--){
            if (b % i == 0) {
                b /= i;
                sum *= i;
                if (b == 1)
                    break;
            }
        }
        return sum;
    }

//    private static void countA(long a) {
//        for (Integer primeNumber : primeNumbers) {
//            if (a % primeNumber == 0)
//                a_mem[primeNumber]++;
//        }
//    }

    private static void countB(long b) {
        System.out.println("check");

        for (Integer primeNumber : primeNumbers) {
            if (b % primeNumber == 0){
                b_mem[primeNumber]++;
                countMem(b / primeNumber, primeNumber);
            }
        }
    }

    private static void countMem(long b, Integer primeNumber) {
        b_mem[primeNumber]++;
        if (b % primeNumber != 0)
            return ;
        countMem(b / primeNumber, primeNumber);
    }

    private static ArrayList<Integer> getPrimeNumbers(int LIMIT) {
        ArrayList<Integer> prime = new ArrayList<>();
        boolean[] isPrime = new boolean[LIMIT + 1]; // int 범위 벗어나면 못함

        System.out.println("!!!check");

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
        // 소수 남김없이 다 모으기
        for (int i = 2; i <= LIMIT; i++) {
            if (isPrime[i]) {
                prime.add(i);
            }
        }
        System.out.println("check!!!");

        return prime;
    }
}
