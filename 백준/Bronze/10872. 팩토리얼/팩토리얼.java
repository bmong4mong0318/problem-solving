
import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static Integer A, B, C;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        A = in.nextInt();

        int ans = 1;
        for(int i = 1; i <= A; i++){
            ans *= i;
        }
        System.out.println(ans);
    }
}
