
import java.io.*;
import java.util.*;
import java.math.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static double N;
    static String str;

    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);

        N = in.nextDouble();

        int a = (int) (N * 0.78);
        int b = (int) (N * 0.8 + N * 0.2 * 0.78);

        System.out.println(a + " " + b);
    }
}
