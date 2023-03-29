import java.io.*;
import java.util.*;

class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());

        for (int i = 0; i < num; i++) {
            String str = br.readLine();
            System.out.println((i+1) + ". " + str);
        }
    }
}
