import java.io.*;
import java.util.*;

class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int count = Integer.parseInt(st.nextToken());

        for (int i = 0; i < count; i++) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            int[] pigs = new int[6];
            int days = 1;
            int tmp = N;
            for (int j = 0; j < 6; j++) {
                pigs[j] = Integer.parseInt(st.nextToken());
                tmp -= pigs[j];
            }
            if (tmp >= 0)
                days++;

            while (true){
                // 그날의 밥
                tmp = N;
                // 새로운 밥
                int[] newPigs = new int[6];
                for (int j = 0; j < 6; j++){
                    int left = pigs[(j + 5) % 6];
//                    System.out.print("left = " + left);
                    int right = pigs[(j + 1) % 6];
//                    System.out.print("right = " + right);
                    int cross = pigs[(j + 3) % 6];
//                    System.out.println("cross = " + cross);
                    int sum = left + right + cross + pigs[j];
                    newPigs[j] = sum;
//                    System.out.println("newPigs[j] = " + newPigs[j]);
                    // 1 2 3 4 5 6
                }
                int sum = 0;
                for (int newPig : newPigs) {
                    sum += newPig;
                }
                // 새로운양으로 밥주었을때
                tmp -= sum;
                // 다 줄수 있으면 하루 +1
                if (tmp >= 0){
                    days++;
                    pigs = newPigs;
                }
                else break;
            }
            System.out.println(days);
        }
    }
}
