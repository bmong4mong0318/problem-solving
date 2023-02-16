package greedy;

import java.io.*;
import java.util.*;

public class boj_2847 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        int max = arr[N-1];
        int cnt = 0;
        for (int i = N - 2; i >= 0; i--){
            if (max <= arr[i]){
                int tmp = arr[i];
                arr[i] -= (Math.abs(arr[i + 1] - arr[i]) + 1);
                cnt += tmp - arr[i];
            }
            max = arr[i];
        }
        System.out.println(cnt);
    }

}
