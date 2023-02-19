package line_sweeping;

import java.io.*;
import java.util.*;

public class boj_2170 {

    // 빠른 입력
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int[][] line;
    public static void main(String[] args) throws IOException {

        int N = Integer.parseInt(br.readLine());

        line = new int[N][2];
        for (int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            line[i][0] = Integer.parseInt(st.nextToken());
            line[i][1] = Integer.parseInt(st.nextToken());
        }

        // 정렬 전
//        for (int i = 0; i < N; i++){
//            System.out.println("[i][0] = " + line[i][0]+" [i][1] = " + line[i][1]);
//        }
        Arrays.sort(line, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2){
                return o1[0] - o2[0];
            }
        });
//         정렬 후
//        for (int i = 0; i < N; i++){
//            System.out.println("[i][0] = " + line[i][0]+" [i][1] = " + line[i][1]);
//        }

        long start = line[0][0];
        long end = line[0][1];
        long len = 0;
        for (int i = 1; i < N; i++){
            // 선이 끊기지 않으면
            if (line[i][0] <= end)
                end = Math.max(end, line[i][1]);
            // 끊기면
            else{
                // 이전 길이 더해주고
                len += end - start;
                // 새로운 라인 지정
                start = line[i][0];
                end = line[i][1];
            }
        }
        len += end - start;

        System.out.println(len);
    }

}
