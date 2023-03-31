import java.io.*;
import java.util.*;

class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb;
    static String str;

    public static void main(String[] args) throws IOException {
        while((str = br.readLine())!= null) {
            sb = new StringBuilder(str);
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'i') {
                    sb.setCharAt(i,'e' );
                }else if (str.charAt(i) == 'e') {
                    sb.setCharAt(i,'i' );
                }else if (str.charAt(i) == 'I') {
                    sb.setCharAt(i,'E' );
                }else if (str.charAt(i) == 'E') {
                    sb.setCharAt(i,'I' );
                }
            }
            System.out.println(sb);
        }
    }
}
