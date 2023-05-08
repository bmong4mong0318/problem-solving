import java.io.*;
import java.util.*;
import java.math.*;

class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    static String str;
    static BigInteger big_a, big_b;

    public static void main(String[] args) throws IOException {
        int sum = 0;
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            numbers.add(num);
        }

        Collections.sort(numbers);

        for (Integer number : numbers) {
            if (number % 2 == 1)
                sum += number;
        }
        if (sum == 0){
            System.out.println(-1);
            System.exit(0);
        }
        System.out.println(sum);
        for (Integer number : numbers) {
            if (number % 2 == 1) {
                System.out.println(number);
                break;
            }
        }
    }
}
