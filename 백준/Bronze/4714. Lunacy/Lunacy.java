import java.io.*;
import java.util.*;

class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    static String str;

    public static void main(String[] args) throws IOException {

        while ((str = br.readLine())!= null) {

            if (str.equals("-1.0")) break;

            double num = Double.parseDouble(str);

            System.out.printf("Objects weighing %.2f on Earth will weigh %.2f on the moon.\n",num, num * 0.167);

        }
    }
}
