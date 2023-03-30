import java.io.*;
import java.util.*;

class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    static String str;
    static char mem = 0;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());

        int num = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= num; i++) {

            str = br.readLine();

            for (int j = 0; j < str.length(); j++) {

                if (str.charAt(j) != mem) {
                    System.out.print(str.charAt(j));
                }
                mem = str.charAt(j);
            }
            mem = 0;
            System.out.println();
        }
    }
}
