
import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static BigInteger A, B, C;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        A = in.nextBigInteger();
        B = in.nextBigInteger();

        System.out.println(A.add(B));
    }
}
