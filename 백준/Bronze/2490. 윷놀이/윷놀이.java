import java.io.*;
import java.util.*;
import java.math.*;

class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    static String str;
    static BigInteger big_a, big_b;

    public static void main(String[] args) throws IOException {

        for (int i = 0; i < 3; i++){
            st = new StringTokenizer(br.readLine());
            List<Integer> yut = new ArrayList<>();
            for(int j = 0; j < 4; j++){
                yut.add(Integer.parseInt(st.nextToken()));
            }
            int count = 0;
            for (Integer integer : yut) {
                if (integer.equals(0))
                    count++;
            }
            if (count == 1)
                System.out.println("A");
            else if (count == 2)
                System.out.println("B");
            else if (count == 3)
                System.out.println("C");
            else if (count == 4)
                System.out.println("D");
            else
                System.out.println("E");
        }
    }
}
