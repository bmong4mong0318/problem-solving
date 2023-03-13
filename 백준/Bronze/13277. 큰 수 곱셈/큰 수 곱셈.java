
import java.util.*;
import java.io.*;
import java.math.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static BigInteger A, B, C;
    static String str;

    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);

        A = in.nextBigInteger();
        B = in.nextBigInteger();

        System.out.println(A.multiply(B));
    }
}
