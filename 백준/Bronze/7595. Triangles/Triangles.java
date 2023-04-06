import java.io.*;
import java.util.*;

import static java.lang.System.exit;

class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    static String str;

    public static void main(String[] args) throws IOException {
        while ((str = br.readLine())!= null) {
            if (str.equals("0")) break;

            int num = Integer.parseInt(str);

            for(int i = 1; i <= num; i++) {
                for(int j = 1; j <= i; j++) {
                    sb.append('*');
                }
                sb.append('\n');
            }
        }
        System.out.print(sb);
    }
}
