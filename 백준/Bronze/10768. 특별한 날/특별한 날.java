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

        int month = in.nextInt();
        int day = in.nextInt();

        if (month < 2)
            System.out.println("Before");
        else if (month == 2){
            if (day == 18)
                System.out.println("Special");
            else if (day < 18)
                System.out.println("Before");
            else
                System.out.println("After");
        }
        else
            System.out.println("After");
    }
}
