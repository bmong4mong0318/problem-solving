import java.io.*;
import java.util.*;
import java.math.*;

class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    static String str;
    static BigInteger big_a, big_b;
    static int tmp;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        Map<String, Integer> nameCount = new HashMap<>();
        LinkedList<String> names = new LinkedList<>();

        for (int i = 0; i < b; i++)
        {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            // 우선 다 넣고
            names.add(name);

            if (nameCount.containsKey(name)) {
                nameCount.put(name, nameCount.get(name) + 1);
            } else {
                nameCount.put(name, 1);
            }
        }

        for (String name : names) {
            if (nameCount.get(name) > 1) {
                nameCount.put(name, nameCount.get(name) - 1);
                continue;
            }
            sb.append(name).append('\n');
            a--;
            if (a == 0) break;
        }
        System.out.println(sb);
    }
}
