import java.io.*;
import java.util.*;

class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb;
    static String str;

    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        if (a < b){
            String fee = null;
            if (b - a >= 31)
                fee = "$500";
            else if (b - a >= 21)
                fee = "$270";
            else if (b - a >= 1)
                fee = "$100";

            System.out.println("You are speeding and your fine is "+ fee + ".");
        } else System.out.println("Congratulations, you are within the speed limit!");

    }
}
