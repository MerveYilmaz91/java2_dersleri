package gun9;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
        int j = 0;
        while (j < 5) {
            System.out.println(j);
            j++;
        }

        System.out.println("---------");
        Scanner scanner = new Scanner(System.in);

        String Pass = " ";
        while (!Pass.equals("1234")) {
            System.out.println("sifre girin");
            Pass = scanner.nextLine().trim();
        }

        System.out.println("giris basarili");

        System.out.println("------------");
        for (int k = 10; k >= 0; k--) {
            System.out.println(k);
        }

        System.out.println("--------");
        for (int t = 2; t <= 10; t+=2) {
            System.out.println(t);
        }
        System.out.println("--------");
        for (int i = 0, l = 10; i <= l; i++, l--) {
            System.out.println("i: " + i + ", l: " + l);
        }
        System.out.println("--------");
        for (int i= 0; i < 10; i++) {
            if (i == 6) {
                break;  // buradaki break tüm for döngüsünü durdurur.
            }
            System.out.println("i");

        }
        System.out.println("--------");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;  // bunun sayesinde çift sayılar yazılcak
                // if blogu içerisine her girdiğinde asagı satıra inmeden döngü içersinde
                // yukarı çıkacak kod






            }
        }

    }
}
