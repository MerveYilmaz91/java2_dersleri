package _21_02_2026_.Degiskenler;

import java.util.Scanner;

public class Scanner05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen kenar uzunlugunu girin: " );
        int a =scan.nextInt();
        int b =scan.nextInt();
        int cevre = a+a+b+b;

        System.out.println("cevre= " + cevre);
        int alan = a*b;
        System.out.println("alan= " + alan);
    }
}
