import java.io.*;
import java.util.*;

class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb;
    static String str;

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();

        int answer = (int)Math.sqrt(num);

        System.out.println("The largest square has side length "+answer+".");
    }
}
