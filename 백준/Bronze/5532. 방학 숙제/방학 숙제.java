import java.io.*;
import java.util.*;

class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb;
    static String str;

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int e = in.nextInt();

        int m = 0;
        int k = 0;

        if (b % d != 0)
            m = b / d + 1;
        else {
            m = (b / d);
        }

        if (c % e != 0)
            k = c / e + 1;
        else {
            k = (c / e);
        }

        System.out.println(a - Math.max(m, k));
    }
}
