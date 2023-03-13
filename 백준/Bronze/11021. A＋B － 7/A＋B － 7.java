
import java.util.*;
import java.io.*;
import java.math.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static Integer A, B, C;
    static String str;

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        A = in.nextInt();

        for (int i = 1; i <= A; i++) {
            int a = in.nextInt();
            int b = in.nextInt();

            System.out.println("Case #" + i + ": " + (a + b));
        }
    }
}
