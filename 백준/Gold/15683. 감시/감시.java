
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import java.util.StringTokenizer;

public class Main {

    static class Point{
        int x;
        int y;
        int cctvNum;
        Point(int x, int y, int cctvNum){
            this.x = x;
            this.y = y;
            this.cctvNum = cctvNum;
        }
    }
    static int N, M;
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        int[][] room = new int[N][M];
        ArrayList<Point> cctv = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                room[i][j] = Integer.parseInt(st.nextToken());
                if (room[i][j] != 0 && room[i][j] != 6){
                    cctv.add(new Point(i, j, room[i][j]));
                }
            }
        }

        dfs(0, room, cctv);
        System.out.println(min);
    }

    public static void dfs(int cnt, int[][] room, ArrayList<Point> cctv){
        if (cnt == cctv.size()){
            min = Math.min(min, countEmpty(room));
            return ;
        }

        int cctvNum = cctv.get(cnt).cctvNum;
        int x = cctv.get(cnt).x;
        int y = cctv.get(cnt).y;
        int[][] tmp;
        if (cctvNum == 1){
            tmp = copyRoom(room);
            checkLeft(tmp, x, y);
            dfs(cnt+1, tmp, cctv);

            tmp = copyRoom(room);
            checkRight(tmp, x, y);
            dfs(cnt+1, tmp, cctv);

            tmp = copyRoom(room);
            checkDown(tmp, x, y);
            dfs(cnt+1, tmp, cctv);

            tmp = copyRoom(room);
            checkUp(tmp, x, y);
            dfs(cnt+1, tmp, cctv);
        }else if (cctvNum == 2) {
            tmp = copyRoom(room);
            checkLeft(tmp, x, y);
            checkRight(tmp, x, y);
            dfs(cnt+1, tmp, cctv);

            tmp = copyRoom(room);
            checkUp(tmp, x, y);
            checkDown(tmp, x, y);
            dfs(cnt+1, tmp, cctv);
        } else if (cctvNum == 3) {
            tmp = copyRoom(room);
            checkLeft(tmp, x, y);
            checkUp(tmp, x, y);
            dfs(cnt+1, tmp, cctv);

            tmp =copyRoom(room);
            checkUp(tmp, x, y);
            checkRight(tmp, x, y);
            dfs(cnt+1, tmp, cctv);

            tmp = copyRoom(room);
            checkRight(tmp, x, y);
            checkDown(tmp, x, y);
            dfs(cnt+1, tmp, cctv);

            tmp = copyRoom(room);
            checkDown(tmp, x, y);
            checkLeft(tmp, x, y);
            dfs(cnt+1, tmp, cctv);
        } else if(cctvNum == 4) {
            tmp = copyRoom(room);
            checkLeft(tmp, x, y);
            checkUp(tmp, x, y);
            checkRight(tmp, x, y);
            dfs(cnt+1, tmp, cctv);

            tmp =copyRoom(room);
            checkUp(tmp, x, y);
            checkRight(tmp, x, y);
            checkDown(tmp, x, y);
            dfs(cnt+1, tmp, cctv);

            tmp = copyRoom(room);
            checkRight(tmp, x, y);
            checkDown(tmp, x, y);
            checkLeft(tmp ,x , y);
            dfs(cnt+1, tmp, cctv);

            tmp = copyRoom(room);
            checkDown(tmp, x, y);
            checkLeft(tmp ,x , y);
            checkUp(tmp, x, y);
            dfs(cnt+1, tmp, cctv);
        } else if(cctvNum == 5) {
            tmp = copyRoom(room);
            checkRight(tmp, x, y);
            checkDown(tmp, x, y);
            checkLeft(tmp ,x , y);
            checkUp(tmp, x, y);
            dfs(cnt+1, tmp, cctv);
        }
    }

    public static void checkLeft(int[][] map, int x, int y) {
        for(int i=y-1; i>=0; i--) {
            if(map[x][i] == 6) return;
            if(map[x][i] != 0) continue;
            map[x][i] = -1;
        }
    }

    public static void checkRight(int[][] map, int x, int y) {
        for(int i=y+1; i<M; i++) {
            if(map[x][i] == 6) return;
            if(map[x][i] != 0) continue;
            map[x][i] = -1;
        }
    }

    public static void checkUp(int[][] map, int x, int y) {
        for(int i=x-1; i>=0; i--) {
            if(map[i][y] == 6) return;
            if(map[i][y] != 0) continue;
            map[i][y] = -1;
        }
    }

    public static void checkDown(int[][] map, int x, int y) {
        for(int i=x+1; i<N; i++) {
            if(map[i][y] == 6) return;
            if(map[i][y] != 0) continue;
            map[i][y] = -1;
        }
    }

    private static int[][] copyRoom(int[][] room) {
        int[][]tmp = new int[N][M];
        for(int i=0; i<N; i++) {
            for(int j=0; j<M; j++) {
                tmp[i][j] = room[i][j];
            }
        }
        return tmp;
    }

    private static int countEmpty(int[][] room) {
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (room[i][j] == 0) ++cnt;
            }
        }
        return cnt;
    }

}
