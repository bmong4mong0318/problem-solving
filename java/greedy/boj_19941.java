package greedy;

import java.io.*;
import java.util.*;
import java.math.*;

class boj_19941 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    static String str;
    static BigInteger big_a, big_b;

    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        char[] list = new char[N];
        boolean[] ate = new boolean[N];

        String str = br.readLine();
        for (int i = 0; i < N; i++) {
            list[i] = str.charAt(i);
        }

        int answer = 0;
        for(int i=0; i<N; i++){
            // P 이면
            if(list[i]=='P') {
                // 첫번째 인덱스 벗어나는 거 처리
                int startIndex = Math.max(i-K,0);
                // 끝 인덱스 벗어나는 거 처리
                int endIndex = Math.min(i+K,N-1);

                for(int j=startIndex; j<=endIndex; j++){
                    if(list[j]=='H' && !ate[j]){
                        ate[j] = true;
                        answer++;
                        break;
                    }
                }
            }
        }
        System.out.println(answer);

    }
}
