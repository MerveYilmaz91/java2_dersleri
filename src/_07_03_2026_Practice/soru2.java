package _07_03_2026_Practice;

import java.util.Scanner;

public class soru2 {
    public static void main(String[] args) {
        /**
         * girilen 2 tam sayı kullanıcıdan aldıktan sonra
         * toplama için T, Çıkarma için C, Çaprma için P, Bölme için B
         * Harflerini kullanıcıdan alarak istege uygun olan işlemi yaptırıp sonucu yazdırın
         **/

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen ilk sayıyı girin: ");
        double ilkSayi = scanner.nextInt();
        System.out.println("lütfen 2. sayıyı girin: ");
        double ikinciSayi = scanner.nextInt();

        System.out.println("lütfen işlem seçin => Toplam (T), cıkarma (C), carpma (P) ve bolme (B)");
        String islem = scanner.next();

        switch (islem) {
            case "T": System.out.println("toplama islemi => " + (ilkSayi + ikinciSayi)); break;
            case "C" : System.out.println("cıkarma islemi => " + (ilkSayi - ikinciSayi)); break;
            case "P" : System.out.println("carpma islemi => " + (ilkSayi * ikinciSayi)); break;
            case "B" : System.out.println("bolme islemi => " + (ilkSayi / ikinciSayi)); break;
            default:
                System.out.println("geçersiz giriş yaptınız");

        }




    }
}
