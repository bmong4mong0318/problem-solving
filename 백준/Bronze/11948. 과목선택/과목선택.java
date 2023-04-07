import java.io.*;
import java.util.*;
import java.math.*;

import static java.lang.System.exit;

class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    static String str;
    static BigInteger big_a, big_b;

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        int[] arr_a = new int[4];
        for (int i = 0; i < 4; i++){
            arr_a[i] = in.nextInt();
        }
        Arrays.sort(arr_a);

        int[] arr_b = new int[2];
        for (int i = 0; i < 2; i++){
            arr_b[i] = in.nextInt();
        }
        Arrays.sort(arr_b);

        System.out.println(arr_a[3] + arr_a[2] + arr_a[1] + arr_b[1]);

    }
}
