package union_find;

import java.io.*;
import java.util.*;

public class boj_20040 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int n, m, result;
    static int[] parents;

    public static void main(String[] args) throws Exception {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        parents = new int[n];
        for (int i = 0; i < n; i++){
            parents[i] = i;
        }

        for (int i = 1; i <= m; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            // 사이클이 형성되는지 확인
            if (union(a,b)){
                // 몇번째에서
                result = i;
                break ;
            }
        }
        System.out.println(result);
    }

    // union인지 확인하는 메서드
    private static boolean union(int a, int b) {
        int aRoot = find(a); // a의 root 노드
        int bRoot = find(b); // b의 root 노드
        // a와 b의 root 노드가 같다면 사이클 형성
        if (aRoot == bRoot) return true;
        // b의 부모는 a로 변경
        parents[bRoot] = aRoot;
        return false;
    }

    // 루트 찾는 메서드
    private static int find(int n) {
        // 부모가 자신이면 루트라는 뜻
        if(n == parents[n]) return n;
        // 루트가 아니면 n의 부모를 찾아서 바로 parents[n]에 대입
        return parents[n] = find(parents[n]);
    }
}
