
import java.io.*;
import java.util.*;
import java.math.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int N;
    static BigInteger a, b;
    static String str;

    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);

        a = in.nextBigInteger();
        b = in.nextBigInteger();

        System.out.println(a.add(b));
    }
}
