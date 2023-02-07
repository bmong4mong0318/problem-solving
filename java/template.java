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
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    // 버퍼를 잡아 놓았기 때문에 bw.flush(); 를 반드시 호출 해주어야 한다.
    // bw.write(String.valueOf(result)); // 종료시마다 결과 값 버퍼에 저장
    // bw.flush(); // 출력

    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        // 특정 범위 내 소수 구하기
        int LIMIT = 0;
        ArrayList<Integer> primeNumbers = getPrimeNumbers(LIMIT);

        // 입력
        input();

        // bfs form
        bfs();
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
        // 10 억 개의 배열을 만드는건 안된다. -> OutOfMemoryError: Java heap space

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
        // 소수 남김없이 다 모으기
        for (int i = 2; i <= LIMIT; i++) {
            if (isPrime[i]) {
                prime.add(i);
            }
        }
        return prime;
    }

    /**
     * 유클리드 호제법 메서드
     * @param bigNumber : 두개의 수 중 큰 수
     * @param smallNumber : 두개의 수 중 작은 수
     * @return
     * 큰 수를 작은 수로 나눈 나머지가 0이면 작은 수를 리턴
     * 0이 아니면 재귀형태로 다시 메서드 호출하며 파라미터로 작은 수, 나머지를 넘거줌
     */
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

    // 이분 탐색은 배열이 정렬되어 있어야 사용할 수 있다
    private static boolean binarySearch(int num, int[] arr) {
        int n = 1; // 에러 방지용
        int start = 0;
        int end = n - 1;
        int mid;

        while (start <= end){
            mid = (start + end) / 2;
            // 찾으면 바로 리턴
            if (arr[mid] == num) return true;
            // 찾으려는 값이 중간보다 크면 스타트를 왼쪽으로 땡겨준다
            else if (arr[mid] < num) start = mid + 1;
            // 찾으려는 값이 중간보다 작으면 엔드를 오른쪽으로 땡겨준다
            else if (arr[mid] > num) end = mid - 1;
        }
        return false;
    }

}
