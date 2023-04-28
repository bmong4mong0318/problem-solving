import java.io.*;
import java.util.*;
import java.math.*;
import java.util.stream.Stream;

class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    static String str;
    static BigInteger big_a, big_b;

    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        // 하나의 수를 기준으로 나머지 수들과의 차의 합이 최소가 되어야함.
        st= new StringTokenizer(br.readLine());
        int[] arr = new int[N];

        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        
        System.out.println(arr[(N-1)/2]);
    }

}
