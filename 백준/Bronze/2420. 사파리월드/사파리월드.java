import java.util.*;

import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static Long N,M;

    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);
        N = in.nextLong();
        M = in.nextLong();

        System.out.println(Math.abs(N-M));
    }
}
