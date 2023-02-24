package greedy;

import java.io.*;
import java.util.*;

public class boj_6550 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        while(true){
            String str = br.readLine();
            if (str == null) break;

            st = new StringTokenizer(str);

            String s = st.nextToken();
            String t = st.nextToken();

            findSubString(s, t);
        }
    }

    private static void findSubString(String s, String t) {
        int j = 0;
        for(int i = 0; i < t.length(); i++){
            if (t.charAt(i) == s.charAt(j))
                j++;
            if (j == s.length())break;
        }
        if (j == s.length()) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

}
