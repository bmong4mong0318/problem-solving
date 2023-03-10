import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static String a;

    static int[] arr1 = new int[]{1, 1, 2, 2, 2, 8};

    public static void main(String[] args) throws IOException {
//        Scanner in = new Scanner(System.in);
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < 6; i++){
            System.out.print(arr1[i] - Integer.parseInt(st.nextToken()) + " ");
        }
    }
}
