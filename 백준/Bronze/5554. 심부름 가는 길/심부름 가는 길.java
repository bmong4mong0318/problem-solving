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
        int sum = (a + b + c + d);

        int sec = sum % 60;
        sum /= 60;

        int min = sum;

        System.out.println(min);
        System.out.println(sec);
    }
}
