import java.io.*;
import java.util.*;

class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    static String str;

    public static void main(String[] args) throws IOException {

        while ((str = br.readLine())!= null) {

            if (str.equals("0")) break;

            double num = Double.parseDouble(str);

            System.out.printf("%.2f\n", 1 + num + Math.pow(num, 2) + Math.pow(num, 3) + Math.pow(num, 4));
        }
    }
}
