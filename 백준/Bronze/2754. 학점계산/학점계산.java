import java.util.*;
import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static String a;
    static HashMap score = new HashMap<String, String>(){
        {
            put("A+", "4.3");put("A0", "4.0");put("A-", "3.7");
            put("B+", "3.3");put("B0", "3.0");put("B-", "2.7");
            put("C+", "2.3");put("C0", "2.0");put("C-", "1.7");
            put("D+", "1.3");put("D0", "1.0");put("D-", "0.7");
            put("F", "0.0");
        }
    };

    public static void main(String[] args) throws IOException {
//        Scanner in = new Scanner(System.in);
        st = new StringTokenizer(br.readLine());
        a = st.nextToken();
        System.out.println(score.get(a));
    }
}
