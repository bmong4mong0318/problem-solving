
import java.io.*;
import java.util.*;
import java.math.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static BigInteger N, M;
    static String str;

    public static void main(String[] args) throws IOException {

        int [] arr = new int[3];

        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 3; i++){
            arr[i] = in.nextInt();
        }

        Arrays.sort(arr);

        System.out.println(arr[1]);
    }
}
