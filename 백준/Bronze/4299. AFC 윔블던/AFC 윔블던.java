import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        int c = (a+ b)/2;
        int d = (a- b)/2;

        if (c == 0 && d == 0) {
            System.out.println(0 + " " + 0);
        }
        else if ((a + b) % 2 == 1 || (a <= b)) {
            System.out.println(-1);
        }else System.out.print(Math.max(c, d) + " " +Math.min(c, d));
    }
}
