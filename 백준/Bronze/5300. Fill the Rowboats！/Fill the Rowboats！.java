import java.io.*;
import java.util.*;

class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    static String str;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());

        int num = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= num; i++) {
            System.out.print(i + " ");
            if (i % 6 == 0 || i == num){
                System.out.print("Go! ");
            }
        }
    }
}
