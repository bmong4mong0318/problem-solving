
import java.io.*;
import java.util.*;
import java.math.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static BigInteger N, M;
    static String str;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        str = st.nextToken();

        st = new StringTokenizer(br.readLine());
        int idx = Integer.parseInt(st.nextToken());

        System.out.println(str.charAt(idx-1));
    }
}
