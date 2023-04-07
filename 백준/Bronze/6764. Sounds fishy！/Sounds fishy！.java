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

        if (a < b && b < c && c < d)
            System.out.println("Fish Rising");
        else if (a > b && b > c && c > d)
            System.out.println("Fish Diving");
        else if (a == b && b == c && c == d)
            System.out.println("Fish At Constant Depth");
        else System.out.println("No Fish");
    }
}
