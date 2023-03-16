
import java.io.*;
import java.util.*;
import java.math.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static BigInteger N, M;
    static String str;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());

        long N = Long.parseLong(st.nextToken());

        long sum = 1;
        for (long i = 1; i <= N; i++){
            sum *= i;
        }
        System.out.println(sum);

//        N = new BigInteger(st.nextToken());
//
//        BigInteger ans = BigInteger.ONE;
//
//        for (BigInteger bi = BigInteger.ONE; bi.compareTo(N) < 0; bi = bi.add(BigInteger.ONE)){
//            ans = ans.multiply(bi);
//        }
//
//        System.out.println(ans.multiply(N));
    }
}
