package math;

import java.io.*;

public class boj_9613 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            long result = 0;
            // 주어진 n개의 수 받기
            String[] info = br.readLine().split(" ");
            int n = Integer.parseInt(info[0]);
            // n개의 수로 가능한 모든 쌍의 개수만큼 반복
            for (int j = 1; j < n; j++) {
                for (int k = j+1; k < n+1; k++) {
                    // 2개의 수 받기
                    int A = Integer.parseInt(info[j]);
                    int B = Integer.parseInt(info[k]);

                    // 최대공약수 구하기
                    int GCD = euclidean(Math.max(A, B), Math.min(A, B));

                    // 구한 최대공약수 결과 값 변수에 저장
                    result += GCD;
                }
            }
            // 테스트 케이스 1개 종료시마다 결과 값 버퍼에 저장
            bw.write(String.valueOf(result));
            bw.newLine();
        }
        // 출력
        bw.flush();
    }
    static int euclidean(int bigNumber, int smallNumber) {
        // 큰 수를 작은 수로 나눈 나머지를 구함
        int R = bigNumber % smallNumber;
        // 나머지가 0인 경우 작은 수 리턴
        if (R == 0) {
            return smallNumber;
        } else {
            // 나머지가 0이 아닌경우 재귀형태로 자기 자신 호출
            // 파라미터로 작은 수, 나머지를 넘김
            return euclidean(smallNumber, R);
        }
    }
}
