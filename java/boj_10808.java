import java.util.Scanner;

public class boj_10808 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        int alpha[] = new int[26];

        for (int i = 0; i < s.length(); i++)
            alpha[s.charAt(i)-97]++;
        for (int i : alpha)
            System.out.print(i+ " ");
    }
}