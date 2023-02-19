
import java.io.*;
import java.util.*;
import java.math.*;

public class template {

    public static class Pair { // pair

        int x, y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    // 인접리스트
    static ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
    // 인접행렬
    static int[][] adjArray;
    // 부모행렬
    static int[] parents;

    static int[] dx = {1, 0, -1, 0, 0}; // DFS, BFS
    static int[] dy = {0, 1, 0, -1, 0}; // 맨끝에 0은 자기 자신 탐색
    static int[][] map; // 2차원 지도
    static int row = map.length; // row의 갯수
    static int col = map[0].length; // 각 row가 가지고 있는 column 갯수


    // int보다 long이 안전하다.
    static long[][] dp;

    // 빠른 입력
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N,M;

    // 빠른 출력
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    // 버퍼를 잡아 놓았기 때문에 bw.flush(); 를 반드시 호출 해주어야 한다.
    // bw.write(String.valueOf(result)); // 종료시마다 결과 값 버퍼에 저장
    // bw.flush(); // 출력
    static StringBuilder sb = new StringBuilder(); // 모아서 한번에 출력

    public static void main(String[] args) throws IOException {

        // 특정 범위 내 소수 구하기
        int LIMIT = 4_000_000;
        List<Integer> primeNumbers = getPrimeNumbers(LIMIT);

        // 역순 정렬
        primeNumbers.sort(Collections.reverseOrder());

        // 임의 정렬
        int[][] line = new int[10][10];
        Arrays.sort(line, new Comparator<int[]>() {
            @Override
            // o1 < o2 크기가 되도록 자동으로 지정됨
            public int compare(int[] o1, int[] o2){
                // 첫번째 인자가 두번째 인자보다 작게끔 하려면 음수리턴
                return o1[0] - o2[0];
            }
        });

        // 입력
        input();

        // 부모 행렬 초기화
        parents = new int[N];
        for (int i = 0; i < N; i++){
            parents[i] = i;
        }

        // bfs form
        bfs();

    }

    private static void input() throws IOException {

        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

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

            for (int i = 0; i < 5; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
            }
        }
    }

    // 특정 범위 내의 소수 구하기 - 에라토스테네스의 체 활용
    private static ArrayList<Integer> getPrimeNumbers(int LIMIT) {
        ArrayList<Integer> primeNumbers = new ArrayList<>();
        boolean[] prime = new boolean[LIMIT + 1]; // int 범위 벗어나면 못함
        // 10 억 개의 배열을 만드는건 안된다. -> OutOfMemoryError: Java heap space

        // 소수가 아니면 true
        prime[0] = prime[1] = true;
        // 2 부터 sqrt(n) 까지
        for (int i = 2; i * i <= LIMIT; i++) {
            // 소수이면
            if (!prime[i]) {
                for (int j = i * i; j <= LIMIT; j += i) {
                    // 그 배수들은 모두 제외
                    prime[j] = true;
                }
            }
        }

        // 소수 남김없이 다 모으기
        for (int i = 0; i <= LIMIT; i++) {
            if (!prime[i]) {
                primeNumbers.add(i);
            }
        }
        return primeNumbers;
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

    // 사이클 판별 + 노드 연결 메서드
    private static boolean union(int a, int b) {
        int aRoot = find(a); // a의 root 노드
        int bRoot = find(b); // b의 root 노드
        // a와 b의 root 노드가 같다면 사이클 형성
        if (aRoot == bRoot) return true;
        // a와 b의 root 노드가 다른 경우
        else {
            if (aRoot < bRoot) {
                parents[bRoot] = aRoot;
            } else {
                parents[aRoot] = bRoot;
            }
            return false;
        }
    }

    // 루트 반환 메서드
    private static int find(int n) {
        // 부모가 자신이면 루트라는 뜻
        if(n == parents[n]) return n;
        // 루트가 아니면 n의 부모를 찾아서 바로 parents[n]에 대입
        // 경로 압축 기법을 통해서 루트노드에 빠르게 접근
        return parents[n] = find(parents[n]);
    }

}
