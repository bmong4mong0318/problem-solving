

import java.util.Scanner;

public class Main {

    static int[] d = new int[1000001];
    static int[] pre = new int[1000001];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        d[1] = 0;
        for (int i = 2; i <= N; i++) {
            d[i] = d[i - 1] + 1;
            pre[i] = i - 1;

            if (i % 2 == 0 && d[i] > d[i/2] + 1) {
                d[i] =  d[i / 2] + 1;
                pre[i] = i / 2;
            }

            if (i % 3 == 0 && d[i] > d[i/3] + 1) {
                d[i] =  d[i / 3] + 1;
                pre[i] = i / 3;
            }
        }
        System.out.println(d[N]);
        int cur = N;
        while (true){
            System.out.print(cur);
            System.out.print(" ");
            if (cur == 1) break;
            cur = pre[cur];
        }
    }


}
