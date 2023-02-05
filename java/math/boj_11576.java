package math;

import java.io.*;
import java.util.*;

public class boj_11576 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static int[] arr = new int[26];
    static int a, b;
    static int baseTen = 0;
    static int len = 0;

    public static void main(String[] args) throws Exception {
        st = new StringTokenizer(br.readLine());

        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = m - 1; i >= 0; i--){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        baseTen = baseToTen(arr);
        int [] ans = baseConversion(baseTen);

        printAns(ans);
    }

    private static void printAns(int[] ans) {

        for (int i = len - 1; i >= 0; i--){
            System.out.print(ans[i] + " ");
        }
    }

    private static int baseToTen(int[] num) {
        int cnt = 0;
        for (int n : num){
            baseTen += n *  Math.pow(a, cnt);
            cnt++;
        }
        return baseTen;
    }

    private static int[] baseConversion(int num) {
        int[] arr = new int[26];
        while (num > 0){
            arr[len++] =  num % b;
            num /= b;
        }
        return arr;
    }

}
