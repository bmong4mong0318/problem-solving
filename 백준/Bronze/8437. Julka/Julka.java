
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

        Scanner in = new Scanner(System.in);

        N = in.nextBigInteger();
        M = in.nextBigInteger();

        System.out.println(N.subtract(M).divide(BigInteger.valueOf(2)).add(M));
        System.out.println(N.subtract(M).divide(BigInteger.valueOf(2)));
    }
}
