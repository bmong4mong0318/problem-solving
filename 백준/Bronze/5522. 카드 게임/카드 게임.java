import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static String a, b;

    public static void main(String[] args) {
        int sum = 0;
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 5; i++){
            sum += in.nextInt();
        }
        System.out.println(sum);
    }
}
