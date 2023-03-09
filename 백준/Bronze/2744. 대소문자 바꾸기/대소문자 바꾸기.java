import java.util.*;

import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static String a, b;

    public static void main(String[] args) throws IOException {

//        Scanner in = new Scanner(System.in);
        st = new StringTokenizer(br.readLine());
        a = st.nextToken();

        for (int i = 0; i < a.length(); i++){
            if (Character.isUpperCase(a.charAt(i))) {
                System.out.print(String.valueOf(a.charAt(i)).toLowerCase());
            }else{
                System.out.print(String.valueOf(a.charAt(i)).toUpperCase());
            }
        }
    }
}
