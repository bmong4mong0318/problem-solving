import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N,M;

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        N = in.nextInt();
        M = in.nextInt();

        if (N > M) {
            System.out.println('>');
        }
        else if (N < M){
            System.out.println('<');
        }
        else {
            System.out.println("==");
        }
    }
}
