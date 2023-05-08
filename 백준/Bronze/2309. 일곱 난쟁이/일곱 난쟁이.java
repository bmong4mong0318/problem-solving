import java.io.*;
import java.util.*;
import java.math.*;

class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    static String str;
    static BigInteger big_a, big_b;
    private static int sum;

    public static void main(String[] args) throws IOException {

        Integer[] numbers = new Integer[9];
        for (int i = 0; i < 9; i++) {
            int num = Integer.parseInt(br.readLine());
            sum += num;
            numbers[i] = num;
        }
        
        loop:
        for (int i = 0; i < 8; i++) {
            for (int j = 1; j < 9; j++){
                int sub = numbers[i] + numbers[j];
                if (sum - sub == 100){
                    numbers[i] = 0;
                    numbers[j] = 0;
                    break loop;
                }
            }
        }

        Arrays.sort(numbers);
        for(int i = 2; i < 9; i++){
            System.out.println(numbers[i]);
        }
    }

}
