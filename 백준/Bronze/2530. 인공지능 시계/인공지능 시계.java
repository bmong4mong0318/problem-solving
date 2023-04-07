
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

        int hour = Integer.parseInt(st.nextToken());
        int min = Integer.parseInt(st.nextToken());
        int sec = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int req = Integer.parseInt(st.nextToken());

        int sum = hour * 60 * 60 + min * 60 + sec + req;

        int h = sum / 3600;
        if (h % 24 == 0)
            System.out.print(0 + " ");
        else
            System.out.print(h % 24 + " ");
        sum %= 3600;

        System.out.print(sum / 60 + " ");
        sum %= 60;

        System.out.print(sum);
    }

}

