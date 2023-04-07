import java.io.*;
import java.util.*;

import static java.lang.System.exit;

class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb;
    static String str;

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        if (N == 0 || N == 2 || N == 3 || N == 5 || N == 6 || N == 7 || N == 8 || N == 9) {
            System.out.print(" * * *");
        }
        System.out.println();
        for (int i = 0; i < 3; i++) {
            if (N == 0 || N == 4 || N == 8 || N == 9) System.out.print("*     *");
            else if (N == 5 || N == 6) System.out.print("*");
            else System.out.print("      *");
            System.out.println();
        }
        if (N == 2 || N == 3 || N == 4 || N == 5 || N == 6 || N == 8 || N == 9) System.out.print(" * * *");
        System.out.println();
        for (int i = 0; i < 3; i++) {
            if (N == 0 || N == 6 || N == 8) System.out.print("*     *");
            else if (N == 1 || N == 3 || N == 4 || N == 5 || N == 7 || N == 9) System.out.print("      *");
            else System.out.print("*");
            System.out.println();
        }
        if (N == 0 || N == 2 || N == 3 || N == 5 || N == 6 || N == 8 || N == 9) System.out.print(" * * *");
        System.out.println();

        scanner.close();
    }

}
