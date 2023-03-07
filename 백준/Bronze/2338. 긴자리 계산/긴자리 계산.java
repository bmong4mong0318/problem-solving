import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static BigInteger N,M;

    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);
        N = in.nextBigInteger();
        M = in.nextBigInteger();

        System.out.println(N.add(M));
        System.out.println(N.subtract(M));
        System.out.println(N.multiply(M));

    }
}
