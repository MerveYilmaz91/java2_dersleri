package JavaOdev2;

import _07_03_2026_Practice.soru3;

import java.util.Scanner;

public class soru3_sinifYoklama {
    public static void main(String[] args) {
        /**
         * Sınıf Yoklama ve İsim Düzeltme:
         * Kullanıcıdan sınıftaki öğrenci sayısını al ve
         * öğrencilerin isimlerini sırayla alıp bir diziye kaydet.
         * Her isim için:
         * - Baş/son boşlukları temizle
         * - İsim içinde boşluk yoksa (tek kelimeyse) uyarı ver
         *  Kullanıcıdan bir yoklama kodu al: "G" (geldi), "Y" (yok), "R" (raporlu).
         *  Koda göre bir mesaj yazdır.
         *  Sonra tüm isimleri numaralı şekilde ekrana bas ve içinde 'a' harfi geçen isimleri say.
         **/

        Scanner scanner=new Scanner(System.in);
        System.out.println("ogrenci sayısını giriniz: ");
        int sayi=scanner.nextInt();
        scanner.nextLine();

        String [] ogrenciİsmi = new String[sayi];
        for (int i = 0; i < sayi; i++) {
            System.out.println((i + 1) + " . öğrencinin adını girin.");
            String isim = scanner.nextLine().trim();

            if (!isim.contains(" ")) {
                System.out.println("uyarı: isim tek kelime");
            }

            System.out.println("yoklama kodu giriniz: (G/Y/R)");
            String kod = scanner.nextLine();

            if (kod.equalsIgnoreCase("G")) {
                System.out.println("öğrenci geldi");
            }else if (kod.equalsIgnoreCase("Y")) {
                System.out.println("öğrenci gelmedi");
            } else if (kod.equalsIgnoreCase("R")) {
                System.out.println("öğrenci raporlu");
            }else {
                System.out.println("geçersiz kod");
            }
            ogrenciİsmi[i] = isim;
        }

        int aSayisi=0;
        for (int i = 0; i < ogrenciİsmi.length; i++) {
            System.out.println((i + 1) + ". " + ogrenciİsmi[i]);

            if (ogrenciİsmi[i].toLowerCase().contains("a")) {
                aSayisi++;
            }
        }
        System.out.println(" a harfi geçen öğrencilerin sayısı: " + aSayisi);

    }
}
