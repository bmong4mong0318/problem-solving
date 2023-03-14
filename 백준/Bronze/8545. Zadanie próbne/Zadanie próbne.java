
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

        str = br.readLine();

        for (int i = str.length()-1 ; i >= 0; i--){
            System.out.print(str.charAt(i));
        }
    }
}
