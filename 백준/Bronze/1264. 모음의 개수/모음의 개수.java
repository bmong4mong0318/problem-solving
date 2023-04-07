
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

        while (true){
            str = br.readLine();
            if (str.equals("#")) break;
            int cnt = 0;
            for (int i = 0; i < str.length(); i++){
                if (str.charAt(i) == 'a'
                        || str.charAt(i) == 'A'
                        || str.charAt(i) == 'e'
                        || str.charAt(i) == 'E'
                        || str.charAt(i) == 'i'
                        || str.charAt(i) == 'I'
                        || str.charAt(i) == 'o'
                        || str.charAt(i) == 'O'
                        || str.charAt(i) == 'u'
                        || str.charAt(i) == 'U') cnt++;
            }
            System.out.println(cnt);
        }
    }
}
