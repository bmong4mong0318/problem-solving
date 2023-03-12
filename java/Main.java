import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static String a, b;

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        a = in.next();
        b = in.next();

        if (a.length() >= b.length()) {
            System.out.println("go");
        } else {
            System.out.println("no");
        }

    }
}
