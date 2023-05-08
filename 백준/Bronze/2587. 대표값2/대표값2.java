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

        List<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++) {
            int num = Integer.parseInt(br.readLine());
            sum += num;
            numbers.add(num);
        }

        Collections.sort(numbers);
        System.out.println(sum / 5);
        System.out.println(numbers.get(2));

    }
}
