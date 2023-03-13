import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int A, B, C;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        A = in.nextInt();
        B = in.nextInt();
        C = in.nextInt();

        System.out.println((A+B)%C);
        System.out.println(((A%C) + (B%C))%C);
        System.out.println((A*B)%C);
        System.out.println( ((A%C) * (B%C))%C);
    }
}
