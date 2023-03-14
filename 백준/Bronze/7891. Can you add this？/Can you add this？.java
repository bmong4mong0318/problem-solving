
import java.io.*;
import java.util.*;
import java.math.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int N, M;
    static String str;

    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);

        N = in.nextInt();

        for (int i = 0; i < N; i++){
            int a = in.nextInt();
            int b = in.nextInt();

            System.out.println(a + b);
        }
    }
}
