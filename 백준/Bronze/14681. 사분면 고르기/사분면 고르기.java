
import java.util.*;
import java.io.*;
import java.math.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N, M, find;
    static String str;

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        N = in.nextInt();
        M = in.nextInt();

        if (N > 0 && M > 0) {
            System.out.println(1);
        }else if (N > 0 && M < 0){
            System.out.println(4);
        } else if (N < 0 && M > 0) {
            System.out.println(2);
        } else{
            System.out.println(3);
        }
    }
}
