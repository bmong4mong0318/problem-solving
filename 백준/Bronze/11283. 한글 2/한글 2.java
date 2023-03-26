
import java.io.*;
import java.util.*;
import java.math.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static String str;
    static StringBuilder sb;
    
    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());
        int N = st.nextToken().charAt(0);

        N -= 44031;
        System.out.println(N);
        
    }

}