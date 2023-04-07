import java.io.*;
import java.util.*;

class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb;
    static StringBuilder sb2;
    static String str;
    static String tmp;

    public static void main(String[] args) throws IOException {
        HashSet<char[]> set = new HashSet<>();
        st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        String s = st.nextToken();
        char[] chars = s.toCharArray();
        set.add(chars);
        sb2 = new StringBuilder(s);

        for (int i = 0; i < n-1; i++) {
            st = new StringTokenizer(br.readLine());
            String s2 = st.nextToken();

            sb = new StringBuilder(s2);
            for (char[] cha : set) {
                for (int j = 0; j < cha.length; j++) {
                    if (s2.charAt(j) != cha[j]) {
                        sb.setCharAt(j, '?');
                    }
                    sb2 = sb;
                }
            }
            chars = s2.toCharArray();
            set.add(chars);
        }
        System.out.println(sb2);
    }
}

