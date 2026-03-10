package _07_03_2026_Practice;

import java.util.Scanner;

public class soru5 {
    public static void main(String[] args) {
        /** kullanıcıdan bir gün alın
         * günün hafta içi mi hafta sonu mu olduğunu yazdırın.
         * geçersiz gün girilirse : geçersiz bir gün girdiniz yazdırın
         **/

        Scanner scanner = new Scanner(System.in);
        System.out.println("gün adını giriniz: ");
        String ad = scanner.nextLine().toLowerCase().trim();

        switch (ad) {
            case "pazartesi":
                System.out.println("hafta içi");
                break;
            case "sali" :
                System.out.println("hafta içi");
                break;
            case "carsamba" :
                System.out.println("hafta içi");
                break;
            case "persembe" :
                System.out.println("hafta içi");
                break;
            case "cuma" :
                System.out.println("hafta içi");
                break;
            case "cumartesi" :
                System.out.println("hafta sonu");
                break;
            case "pazar" :
                System.out.println("hafta sonu");
                break;
                default:
                    System.out.println("geçersiz bir gün girdiniz");
        }
    }
}
