package greedy;

import java.io.*;
import java.util.*;

public class boj_1541 {

    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);

        // 첫번째 값 체크용
        int sum = Integer.MAX_VALUE;

        // - 를 기준으로 나누기
        String[] subtraction = in.nextLine().split("-");

        // 나눈거 돌면서
        for (int i = 0; i < subtraction.length; i++){
            int tmp = 0;

            // 뺄셈으로 나뉜 토큰을 덧셈으로 분리하여 해당 토큰들을 더한다.
            String[] addition = subtraction[i].split("\\+");

            for(int j = 0; j < addition.length; j++){
                tmp += Integer.parseInt(addition[j]);
            }

            // 첫번째 수는 양수
            if (sum == Integer.MAX_VALUE) {
                sum = tmp;
            } else { // 나머지 수들은 빼주기
                sum -= tmp;
            }
        }
        System.out.println(sum);
    }
}
