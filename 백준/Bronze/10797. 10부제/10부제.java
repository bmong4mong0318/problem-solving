
import java.io.*;
import java.util.*;
import java.math.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static String str;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());

        int[] arr = new int[5];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 5; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int cnt = 0;
        for (int i : arr) {
            if (i == num){
                cnt++;
            }
        }
        System.out.println(cnt);
    }

}