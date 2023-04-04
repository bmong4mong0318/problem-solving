
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    // 빠른 입력
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // 빠른 출력
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    // 버퍼를 잡아 놓았기 때문에 bw.flush(); 를 반드시 호출 해주어야 한다.
    // bw.write(String.valueOf(result)); // 종료시마다 결과 값 버퍼에 저장
    // bw.flush(); // 출력
    static int n, m;

    static StringTokenizer st;
    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        int[] sang = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++){
            sang[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(sang);

        st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        int[] me = new int[m];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++){
            me[i] = Integer.parseInt(st.nextToken());
            if (isDup(me[i], sang)) {
                System.out.print(1 + " ");
            } else {
                System.out.print(0 + " ");
            }
        }
    }

    private static boolean isDup(int num, int[] sang) {
        int start = 0;
        int end = n - 1;
        int mid;

        while (start <= end){
            mid = (start + end) / 2;
            if (sang[mid] == num) return true;
            else if (sang[mid] < num) start = mid + 1;
            else if (sang[mid] > num) end = mid - 1;
        }
        return false;
    }
}
