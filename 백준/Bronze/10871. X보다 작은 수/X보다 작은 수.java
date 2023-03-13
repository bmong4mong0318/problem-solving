
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
        int find = in.nextInt();
        int[] arr = new int[A];

        for (int i = 0; i < A; i++){
            arr[i] = in.nextInt();
            if (arr[i] < find){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
