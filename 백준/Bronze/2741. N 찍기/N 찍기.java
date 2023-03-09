import java.util.*;

import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int a, b;

    public static void main(String[] args) throws IOException {

//        Scanner in = new Scanner(System.in);
        st = new StringTokenizer(br.readLine());
        a = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= a; i++){
            System.out.println(i);
        }

    }
}
