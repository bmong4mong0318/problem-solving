import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class template {

    public static class Pair { // pair

        int x, y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static List<Integer>[] adj; // 인접리스트

    static int[] dx = {1, 0, -1, 0}; // DFS, BFS
    static int[] dy = {0, 1, 0, -1};
    static int[][] map; // 2차원 지도
    static int row = map.length; // row의 갯수
    static int col = map[0].length; // 각 row가 가지고 있는 column 갯수

    // 빠른 입력
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // 빠른 출력
    // 버퍼를 잡아 놓았기 때문에 bw.flush(); bw.close(); 를 반드시 호출 해주어야 한다.
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        // 특정 범위 내 소수 구하기
        int LIMIT = 0;
        ArrayList<Integer> primeNumbers = getPrimeNumbers(LIMIT);

        // 입력
        input();

        // bfs form
        bfs();

        // 최대 공약수 구하기
//        gcd(a, b);
    }

    private static void input() throws IOException {

        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        map = new int[N][M];
        for (int i = 0; i < N; i++) {
            String tmp;
            st = new StringTokenizer(br.readLine());
            tmp = st.nextToken();
            for (int j = 0; j < M; j++) {
                map[i][j] = tmp.charAt(j);
            }
        }
    }

    private static void bfs() {
        Queue<int[]> q = new LinkedList<>();

        while (!q.isEmpty()) {
            int cur[] = q.poll();
            int x = cur[0];
            int y = cur[1];

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
            }
        }
    }

    // 특정 범위 내의 소수 구하기 - 에라토스테네스의 체 활용
    private static ArrayList<Integer> getPrimeNumbers(int LIMIT) {
        ArrayList<Integer> prime = new ArrayList<>();
        boolean[] isPrime = new boolean[LIMIT + 1]; // int 범위 벗어나면 못함

        //처음에 모두 소수라고 가정
        Arrays.fill(isPrime, true);
        //2 부터 sqrt(n) 까지
        for (int i = 2; i * i <= LIMIT; i++) {
            // 이미 지워진 수는 무시
            if (!isPrime[i]) {
                continue;
            }

            //소수만 모으고
            prime.add(i);
            for (int j = i * i; j <= LIMIT; j += i) {
                // 그 배수들은 모두 제외
                isPrime[j] = false;
            }
        }
        return prime;
    }

    // 두 수의 최대공약수 구하기
    public static long gcd(long a, long b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}
