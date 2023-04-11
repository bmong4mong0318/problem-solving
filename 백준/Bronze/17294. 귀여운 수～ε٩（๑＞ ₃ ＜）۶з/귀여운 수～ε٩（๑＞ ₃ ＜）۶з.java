import java.io.*;
import java.util.*;
import java.math.*;

import static java.lang.System.exit;

class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    static String str;
    static BigInteger big_a, big_b;
    static int tmp;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());

        str = st.nextToken();
        if (str.length() == 1) {
            System.out.println("◝(⑅•ᴗ•⑅)◜..°♡ 뀌요미!!");
            exit(0);
        }

        tmp = Integer.parseInt(String.valueOf(str.charAt(0)))
                - Integer.parseInt(String.valueOf(str.charAt(1)));

        for (int i = 0; i < str.length()-1; i++){
            int a = Integer.parseInt(String.valueOf(str.charAt(i)));
            int b = Integer.parseInt(String.valueOf(str.charAt(i+1)));

            if (a - b != tmp){
                System.out.println("흥칫뿡!! <(￣ ﹌ ￣)>");
                exit(0);
            }
            else tmp = a - b;
        }

        System.out.println("◝(⑅•ᴗ•⑅)◜..°♡ 뀌요미!!");
    }
}
