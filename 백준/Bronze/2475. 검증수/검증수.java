import java.util.*;

import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static Long a,b,c,d,e;

    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);
        a = in.nextLong();
        b = in.nextLong();
        c = in.nextLong();
        d = in.nextLong();
        e = in.nextLong();

        System.out.println((int)(Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2) + Math.pow(d, 2) + Math.pow(e, 2))%10);
    }
}
