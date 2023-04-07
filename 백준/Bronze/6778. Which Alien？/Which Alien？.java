import java.io.*;
import java.util.*;

class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int antenna = sc.nextInt();
        int eyes = sc.nextInt();
        sc.close();

        if(antenna >= 3 && eyes <=4)
            System.out.println("TroyMartian");
        if(antenna <= 6 && eyes >= 2)
            System.out.println("VladSaturnian");
        if(antenna <= 2 && eyes <= 3)
            System.out.println("GraemeMercurian");
    }
}
