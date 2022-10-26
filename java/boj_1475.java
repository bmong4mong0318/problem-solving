import java.util.Scanner;

public class boj_1475 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int set[] = new int[10];

        while (num > 0){
            int tmp = num % 10;
            if (tmp == 6 && set[6] > set[9])
                set[9]++;
            else if (tmp == 9 && set[9] > set[6])
                set[6]++;
            else
                set[tmp]++;
            num /= 10;
        }
        int max = 0;
        for (int i : set)
            if (i > max)
                max = i;
        System.out.print(max);
    }
}
