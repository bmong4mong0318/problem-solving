public class Yujin_Pick {

    // 해싱_프로그래머스

    public static void main(String[] args) {

        int[] bell = new int[]{1, 2, 1, 1, 1, 2, 2, 1};
        System.out.println(solution(bell));

    }

    public static int solution(int[] bell) {
        int answer = 0;
        // 구간 길이 하나씩 줄여가면서
        for (int len = bell.length; len > 1; len--) {
            // 구간 이동 하면서
            for (int move = 0; move <= bell.length - len; move++) {
                int cnt_1 = 0;
                int cnt_2 = 0;
                // 구간 내에서 1 이랑 2 갯수 세기
                for (int i = 0; i < len; i++) {

                    if (bell[move + i] == 1) ++cnt_1;
                    else if (bell[move + i] == 2) ++cnt_2;
                }
                // 구간 길이 만큼 돌았을 때 1 갯수 == 2 갯수 이면 max 길이값 갱신
                if (cnt_1 == cnt_2) answer = Math.max(answer, len);
            }
        }
        return answer;
    }
}

