package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_14584 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static String[] info;

    public static void main(String[] args) throws IOException {
        String code = br.readLine();

        int N = Integer.parseInt(br.readLine());
        info = new String[N];
        for (int i = 0; i < N; i++){
            info[i] = br.readLine();
        }

        StringBuilder new_code = null;
        loop:
        for (int j = 1; j <= 26; j++){
            new_code = new StringBuilder();
            for (int i = 0; i < code.length(); i++){
                if(code.charAt(i) + j > 'z')
                    new_code.append((char) (code.charAt(i) - (26 - j)));
                else
                    new_code.append((char) (code.charAt(i) + j)) ;
            }

            for (String s : info) {
                if(new_code.toString().contains(s))
                    break loop;
            }

        }
        System.out.println(new_code);
    }
}
