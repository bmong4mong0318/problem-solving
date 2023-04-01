import java.io.*;
import java.util.*;

class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb;
    static String str;

    public static void main(String[] args) throws IOException {
        for(int i = 0; i < 3; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()) * 3600;
            int b = Integer.parseInt(st.nextToken()) * 60;
            int c = Integer.parseInt(st.nextToken());

            int d = Integer.parseInt(st.nextToken()) * 3600;
            int e = Integer.parseInt(st.nextToken()) * 60;
            int f = Integer.parseInt(st.nextToken());

            int sum = d + e + f - (a + b + c);

            int hour = sum / 3600;
            int min = (sum % 3600) / 60;
            int sec = (sum % 3600) % 60;

            System.out.println(hour + " " + min + " " + sec);

        }
    }
}
