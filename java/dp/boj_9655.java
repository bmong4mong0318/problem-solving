package dp;

import java.io.*;

public class boj_9655 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());

        if (N % 2 == 1) System.out.println("SK");
        else System.out.println("CY");
    }

}
