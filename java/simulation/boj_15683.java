//package simulation;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.StringTokenizer;
//
//public class boj_15683 {
//
//    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//    static StringTokenizer st;
//
//    public static void main(String[] args) throws IOException {
//        st = new StringTokenizer(bf.readLine());
//        int N = Integer.parseInt(st.nextToken());
//        int M = Integer.parseInt(st.nextToken());
//
//        int[][] room = new int[N][M];
//        int[] dx = {1, 0, -1, 0};
//        int[] dy = {0, 1, 0, -1};
//        List<Integer> cctvs = new ArrayList<>();
//        List<String> dir = List.of("",
//            "1, 2, 3, 4", // 1
//            "1, 2", // 2
//            "1, 2, 3, 4", // 3
//            "1, 2, 3, 4", // 4
//            "1"); // 5
//
//        for (int i = 0; i < N; i++) {
//            st = new StringTokenizer(bf.readLine());
//            for (int j = 0; j < M; j++) {
//                int number = Integer.parseInt(st.nextToken());
//                room[i][j] = number;
//                cctvs.add(number); // CCTV 저장
//            }
//        }
//
//        // cctv로 인해서 나오는 가짓수 구하기
//
//        // 모든 가짓수에 따른 방향 세팅
//
//        int ans = 0;
//        // 박스 완탐
//        for (int i = 0; i < N; i++) {
//            for (int j = 0; j < M; j++) {
//                if (room[i][j] == 1) {
//
//                    // check direction
//
//                    int dir_cnt = 0;
//                    // 가로방향
//                    if (k == 0) {
//                        dir_cnt = M - i - 1;
//                    } else if (k == 2) {
//                        dir_cnt = i;
//                    }
//                    // 세로방향
//                    else if (k == 1) {
//                        dir_cnt = N - j - 1;
//                    } else {
//                        dir_cnt = j;
//                    }
//
//                    int x_n = 1;
//                    int y_n = 1;
//
//                    while (dir_cnt != 0) {
//                        if (room[i + dy[k] * y_n][j + dx[k] * x_n] == 6) {
//                            if (k == 0 || k == 2) {
//                                x_n = 0;
//                            } else {
//                                y_n = 0;
//                            }
//                        }
////                            else if (room[i + dy[k] * y_n][j + dx[k] * x_n] != 0)
//////                                continue;
//                        else {
//                            room[i + dy[k] * y_n][j + dx[k] * x_n] = '#';
//                        }
////                            System.out.println("check");
//                        --dir_cnt;
//                        ++x_n;
//                        ++y_n;
//                    }
//                } else if (room[i][j] == 2) {
//
//                } else if (room[i][j] == 3) {
//
//                } else if (room[i][j] == 4) {
//
//                } else if (room[i][j] == 5) {
//
//                }
//
//                // 사각지대 갯수 세기
//                int cnt = countEmpty(N, M, room);
//
//                // 최솟값 비교후 갱신
//                if (k == 0) {
//                    ans = cnt;
//                    System.out.println("cnt = " + cnt);
//                } else {
//                    ans = Math.min(ans, cnt);
//                }
//
//                // '#' 초기화
//                removeSharp(N, M, room);
//
//            }
//        }
//
//        System.out.println(ans);
//
//        // 사각지대 갯수 세기
//        int cnt = 0;
//        for (int i = 0; i < N; i++) {
//            for (int j = 0; j < M; j++) {
//                System.out.print(room[i][j] + " ");
//                if (room[i][j] == 0) {
//                    ++cnt;
//                }
//            }
//            System.out.println();
//        }
//    }
//
//    private static void removeSharp(int N, int M, int[][] room) {
//        for (int i = 0; i < N; i++) {
//            for (int j = 0; j < M; j++) {
//                if (room[i][j] == '#') {
//                    room[i][j] = 0;
//                }
//            }
//        }
//    }
//
//    private static int countEmpty(int N, int M, int[][] room) {
//        int cnt = 0;
//        for (int i = 0; i < N; i++) {
//            for (int j = 0; j < M; j++) {
//                if (room[i][j] == 0) {
//                    ++cnt;
//                }
//            }
//        }
//        return cnt;
//    }
//
//}
