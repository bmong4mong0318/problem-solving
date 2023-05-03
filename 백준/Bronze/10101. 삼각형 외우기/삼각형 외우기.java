import java.io.*;
import java.util.*;
import java.math.*;

class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    static String str;
    static BigInteger big_a, big_b;

    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int sum = a + b + c;
        if (a == 60 && b == 60 && c == 60)
            System.out.println("Equilateral");
        else if (sum == 180 &&
                (a==b && a!=c || b==c && b!=a || c==a && c!=b ))
            System.out.println("Isosceles");
        else if (sum == 180 && a != b && b != c && c != a)
            System.out.println("Scalene");
        else if (sum != 180)
            System.out.println("Error");
    }
}
