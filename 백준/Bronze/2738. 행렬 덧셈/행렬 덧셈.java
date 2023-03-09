import java.util.*;

import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int a, b;

    public static void main(String[] args) throws IOException {

//        Scanner in = new Scanner(System.in);
        st = new StringTokenizer(br.readLine());
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());

        int[][] map1 = new int[a][b];
        for (int i = 0 ; i < a; i++){
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < b; j++){
                map1[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int[][] map2 = new int[a][b];
        for (int i = 0 ; i < a; i++){
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < b; j++){
                map2[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0 ; i < a; i++){
            for (int j = 0; j < b; j++){
                System.out.print(map1[i][j] + map2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
