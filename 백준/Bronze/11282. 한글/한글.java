
import java.io.*;
import java.util.*;
import java.math.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static String str;
    static StringBuilder sb;

    // 19
    static char[] cho = {'ㄱ', 'ㄲ', 'ㄴ', 'ㄷ', 'ㄸ', 'ㄹ', 'ㅁ', 'ㅂ', 'ㅃ', 'ㅅ', 'ㅆ', 'ㅇ', 'ㅈ', 'ㅉ', 'ㅊ', 'ㅋ', 'ㅌ', 'ㅍ', 'ㅎ'};
    // 21
    static char[] joong = {'ㅏ', 'ㅐ', 'ㅑ', 'ㅒ', 'ㅓ', 'ㅔ', 'ㅕ', 'ㅖ', 'ㅗ', 'ㅘ', 'ㅙ', 'ㅚ', 'ㅛ', 'ㅜ', 'ㅝ', 'ㅞ', 'ㅟ', 'ㅠ', 'ㅡ', 'ㅢ', 'ㅣ'};
    // 28
    static char[] jong = {'ㄱ', 'ㄲ', 'ㄳ', 'ㄴ', 'ㄵ', 'ㄶ', 'ㄷ', 'ㄹ', 'ㄺ', 'ㄻ', 'ㄼ', 'ㄽ', 'ㄾ', 'ㄿ', 'ㅀ', 'ㅁ', 'ㅂ', 'ㅄ', 'ㅅ', 'ㅆ', 'ㅇ', 'ㅈ', 'ㅊ', 'ㅋ'};

    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        N += 44031;
        char C = (char) N;

        System.out.println(C);
//        //divide str in to three numbers
//        boolean flag = false;
//        String f = str.substring(0, 2);
//        if (Integer.parseInt(f) > 19) {
//            f = str.substring(0, 1);
//            flag = true;
//        }
//
//        boolean flag2 = false;
//        boolean flag3 = false;
//        String s;
//        if (flag) {
//            flag3 = true;
//            s = str.substring(1, 3);
//            if (Integer.parseInt(s) > 21) {
//                s = str.substring(1, 2);
//                flag2 = true;
//            }
//        }else {
//            s = str.substring(2, 4);
//            if (Integer.parseInt(s) > 21) {
//                s = str.substring(2, 3);
//                flag2 = true;
//            }
//        }
//
//        String t;
//        if (flag3) {
//            t = str.substring(3);
//            if (flag2){
//                t = str.substring(2);
//            }
//        } else {
//            t = str.substring(4);
//            if (flag2){
//                t = str.substring(3);
//            }
//        }
//
//        int f_num = Integer.parseInt(f);
//        int s_num = Integer.parseInt(s);
//        int t_num = Integer.parseInt(t);
    }

}