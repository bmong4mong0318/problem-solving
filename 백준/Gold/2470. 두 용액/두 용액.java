import java.io.*;
import java.util.*;
import java.math.*;

class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    static String str;
    static BigInteger big_a, big_b;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        int[] list = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            list[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(list);

        int st = 0;
        int ed = list.length-1;
        int hap = 0;
        int min = Integer.MAX_VALUE;
        int ans_st = 0;
        int ans_ed = 0;
        // -99 -2 -1 4 98
        while (st < ed){
            hap = list[ed]+list[st];

            int tmp = min;

            min = Math.min(min, Math.abs(hap));
            if (tmp != min){
                ans_st = st;
                ans_ed = ed;
            }

            if (hap < 0){
                st++;
            } else ed--;
        }

        System.out.println(list[ans_st] + " " + list[ans_ed]);
    }
}
