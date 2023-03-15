
import java.io.*;
import java.util.*;
import java.math.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int N;
    static int a, b;
    static String str;

    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);

        int ax = in.nextInt();
        int ay = in.nextInt();
        int az = in.nextInt();

        int cx = in.nextInt();
        int cy = in.nextInt();
        int cz = in.nextInt();

        System.out.print((cx - az) + " " + (cy / ay) + " " + (cz - ax));
    }
}
