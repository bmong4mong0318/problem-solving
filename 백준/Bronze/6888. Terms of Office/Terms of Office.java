import java.io.*;
import java.util.*;

class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb;
    static String str;

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        int st = in.nextInt();
        int end = in.nextInt();

        int answer = st;
        while (answer <= end){
            System.out.println("All positions change in year " + answer);
            answer += 60;
        }
    }
}
