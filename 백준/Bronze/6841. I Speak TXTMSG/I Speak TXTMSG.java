import java.io.*;
import java.util.*;

class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static String str;

    public static void main(String[] args) throws IOException {

        HashMap<String, String> msg = new HashMap<String, String>() {
            {
                put("CU", "see you");
                put(":-)", "I’m happy");
                put(":-(", "I’m unhappy");
                put(";-)", "wink");
                put(":-P", "stick out my tongue");
                put("(~.~)", "sleepy");
                put("TA", "totally awesome");
                put("CCC", "Canadian Computing Competition");
                put("CUZ", "because");
                put("TY", "thank-you");
                put("YW", "you’re welcome");
                put("TTYL", "talk to you later");
            }
        };

        while ((str = br.readLine()) != null){
            if (msg.containsKey(str)){
                System.out.println(msg.get(str));
            }
            else System.out.println(str);
        }
    }
}
