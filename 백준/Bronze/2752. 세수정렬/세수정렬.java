
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
        StringBuilder sb = new StringBuilder();

        HashSet<Integer> hi = new HashSet<>();
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        hi.add(a);
        hi.add(b);
        hi.add(c);

        int max = Math.max(a, Math.max(b, c));
        hi.remove(max);

        int min = Math.min(a, Math.min(b, c));
        hi.remove(min);

        sb.append(min).append(" ")
                .append(hi.toArray()[0]).append(" ")
                        .append(max).append(" ");

        System.out.print(sb);

    }

}

