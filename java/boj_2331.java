
import java.io.*;
import java.util.*;

public class boj_2331 {

    // 빠른 입력
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int A,P;
    static ArrayList<Integer> D = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());

        A = Integer.parseInt(st.nextToken());
        P = Integer.parseInt(st.nextToken());

        D.add(A);
        int num  = makePow(A);
        D.add(num);

        while (true){
            num = makePow(num);
            if (D.contains(num)) {
                break;
            }
            D.add(num);
        }

        System.out.println(D.indexOf(num));
    }

    static int makePow(int num){
        int sum = 0;
        while (num > 0){
            sum += Math.pow(num % 10 , P);
            num /= 10;
        }
        return sum;
    }

}
