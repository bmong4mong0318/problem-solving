import java.io.*;
import java.util.*;
import java.math.*;
import java.util.stream.Stream;

class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    static String str;
    static BigInteger big_a, big_b;

    public static void main(String[] args) throws IOException {

        String N_str = br.readLine();



        int sum = 0;
        for (int i = 0; i < N_str.length(); i++) {
            sum += Integer.parseInt(String.valueOf(N_str.charAt(i)));
        }

        Integer[] arr = new Integer[N_str.length()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(String.valueOf(N_str.charAt(i)));
        }

        Arrays.sort(arr, Collections.reverseOrder());
        for (int i : arr) {
            sb.append(i);
        }

        char check = sb.toString().charAt(sb.length() - 1);
        if (sum % 3 != 0 || check != '0'){
            System.out.println(-1);
        }else System.out.println(sb);
    }

}
