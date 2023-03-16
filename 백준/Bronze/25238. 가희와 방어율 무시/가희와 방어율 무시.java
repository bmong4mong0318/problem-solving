
import java.io.*;
import java.util.*;
import java.math.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static double N, M;
    static String str;

    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);

        N = in.nextDouble();
        M = in.nextDouble();

        double ans = N - N * (M / (double) 100);

        System.out.println(ans >= 100 ? 0 : 1);

    }
}
