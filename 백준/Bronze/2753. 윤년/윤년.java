import java.util.*;

import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static Integer a;

    public static void main(String[] args) throws IOException {

//        Scanner in = new Scanner(System.in);
        st = new StringTokenizer(br.readLine());
        a = Integer.valueOf(st.nextToken());

        if ((a % 4 == 0 && a % 100 != 0)|| a % 400 == 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
