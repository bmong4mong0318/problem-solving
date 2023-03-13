import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int a, b;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        a = in.nextInt();

        if (a >= 90) {
            System.out.println("A");
        } else if (a >= 80) {
            System.out.println("B");
        } else if (a >= 70){
            System.out.println("C");
        } else if (a >= 60){
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
