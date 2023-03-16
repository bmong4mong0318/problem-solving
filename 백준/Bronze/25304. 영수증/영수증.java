
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
        M = in.nextInt();

        int sum = 0;
        for (int i = 0; i < M; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            sum += a * b;
        }

        System.out.println(sum == N ? "Yes" : "No");

    }
}
