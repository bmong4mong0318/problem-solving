import java.io.*;
import java.util.*;

import static java.lang.System.exit;

class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    static String str;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());

        int num = Integer.parseInt(st.nextToken());

        int sum = 1;
        for (int i = 1; i <= num; i++){
            sum *= i;
        }
        str = String.valueOf(sum);

        System.out.println(str.charAt(str.length()-1));
    }
}
