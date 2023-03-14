
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

        while ((str = br.readLine()) != null){

            st = new StringTokenizer(str);

            int a = Integer.parseInt(st.nextToken());
            if (a == 0) break;

            System.out.println((a * (a+1))/2);
        }
    }
}
