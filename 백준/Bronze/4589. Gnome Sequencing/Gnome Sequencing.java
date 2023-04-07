import java.io.*;
import java.util.*;

class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());

        sb.append("Gnomes:").append("\n");
        for (int i = 0; i < num; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if ((a < b && b < c) || (a > b && b > c)) {
                sb.append("Ordered").append("\n");
            }
            else {
                sb.append("Unordered").append("\n");
            }
        }
        System.out.println(sb);
    }
}
