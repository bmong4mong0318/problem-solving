package math;

import java.util.Scanner;

public class boj_1484 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int G = scanner.nextInt();
        boolean flag = false;

        for (int mem = 1; mem < 75_000; ++mem){
            double sqrt = Math.sqrt(mem * mem + G);
            long compare = (long)sqrt;
            if (sqrt - compare == 0) {
                System.out.println(compare);
                flag = true;
            }
        }
        if (!flag)
            System.out.println(-1);
    }
}
