package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_4134 {

    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        long n = Long.parseLong(bf.readLine());
        for (int i = 0; i < n; i++) {
            long num = Long.parseLong(bf.readLine());
            if (num == 0 || num == 1 || num == 2){
                System.out.println(2);
                continue;
            }
            while (true) {
                if (isPrime(num)) break;
                num++;
            }
            System.out.println(num);
        }
    }

    private static boolean isPrime(long n) {
        for (long i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
