package simulation;

import java.io.*;
import java.util.*;

public class boj_8958 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int T = Integer.parseInt(in.nextLine());
        while (T-- > 0){

            String s = in.nextLine();
            String[] correct = s.split("X");

            int sum = 0;
            for (String tmp : correct) {
                for (int i = 1; i <= tmp.length(); i++)
                    sum += i;
            }
            System.out.println(sum);
        }
    }
}
