package greedy;

import java.io.*;
import java.util.*;

public class boj_1744 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        List<Integer> ans = new ArrayList<>();

        int cnt = 0;
        for (int i = 0; i < N; i++){
            int num = Integer.parseInt(br.readLine());

            if (num == 0) cnt++;
            else ans.add(num);
        }
        Collections.sort(ans);

        //0 갯수 만큼 절댒값이 작은 음수제거
        if (cnt != 0) {
            int k = 0;
            while (ans.get(k) < 0)
                k++;
            while (cnt-- > 0 && k != 0) {
                ans.remove(--k);
            }
        }

        List<Integer> L = new ArrayList<>();

        int sum = 0;

        // 양수인 동안
        int i = ans.size()-1;
        while(ans.get(i) > 0){
            L.add(ans.get(i));
            if (L.size() == 2) {
                sum += L.get(0) * L.get(1);
                for (Integer integer : L) {
                    System.out.println("integer = " + integer);
                }
                L.clear();
            }
            i--;
        }
        if (!L.isEmpty()){
            for (Integer integer : L) {
                sum += integer;
            }
            L.clear();
        }

        // 음수인 동안
        while (i != -1){
            L.add(ans.get(i));
            if (L.size() == 2) {
                sum += L.get(0) * L.get(1);
                for (Integer integer : L) {
                    System.out.println("integer = " + integer);
                }
                L.clear();
            }
            i--;
        }
        if (!L.isEmpty()){
            for (Integer integer : L) {
                sum += integer;
            }
        }
        System.out.println(sum);

    }

}
