
import java.io.*;
import java.util.*;
import java.math.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static String str;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int ans = a * b;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 5; i++){
            int num = Integer.parseInt(st.nextToken());

            System.out.print(num - ans + " ");
        }
    }

}

