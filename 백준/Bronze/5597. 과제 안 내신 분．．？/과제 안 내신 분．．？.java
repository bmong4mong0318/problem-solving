import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static String a, b;
    static boolean[] check = new boolean[30];
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 28; i++){
            check[in.nextInt() - 1] = true;
        }

        for(int i = 0; i < 30; i++){
            if (!check[i]) {
                System.out.println(i + 1);
            }
        }
    }
}
