package JavaOdev2;

import java.util.Scanner;

public class soru8_KargoTakip {
    public static void main(String[] args) {
        /**
         * Kargo Takip ve Teslim Seçimi:
         * Kullanıcıdan 5 takip kodu alıp bir diziye kaydet.
         * Her kod için baş/son boşlukları temizle ve kod uzunluğu 10 değilse uyarı ver.
         * Kullanıcıdan teslim tipi al: "ev", "ofis", "şube".
         * Teslim tipine göre ücret belirle.
         * Kullanıcıdan mesafeyi (km) al; 30 km üstüyse ek ücret uygula.
         * Son olarak, her kodun ilk 2 karakterini yazdır ve
         * kodlarda kaç tane harf kaç tane rakam olduğunu toplamda say.
         **/

        Scanner scanner = new Scanner(System.in);

        String [] takipKodlari = new String[5];

        for(int i = 0; i < 5; i++){
            System.out.println("takip kodu giriniz: ");
            takipKodlari[i] = scanner.nextLine().trim();

            if (takipKodlari[i].length() != 10) {
                System.out.println("uyarı: takip kodu 10 karakter olmalı");
            }
        }
        System.out.println("teslim tipini giriniz: ev / ofis / şube");
        String teslimTipi =  scanner.nextLine();

        int ucret = 0;
        if (teslimTipi.equalsIgnoreCase("ev")) {
            ucret = 30;
        } else if (teslimTipi.equalsIgnoreCase("ofis")) {
            ucret = 20;
        }else if (teslimTipi.equalsIgnoreCase("sube")) {
            ucret = 25;
        } else {
            System.out.println("geçersiz teslim tipi.");
        }

        System.out.println("mesafeyi giriniz:");
        int mesafe = scanner.nextInt();
         if (mesafe > 30) {
             System.out.println("30 km üstü mesafe, ek ücret eklendi.");
             ucret += 10;

         }
        System.out.println("teslim ucreti " + ucret +   "TL" );

         int harfSayisi = 0;
         int rakamSayisi = 0;

         for (int i = 1; i < takipKodlari.length; i++) {
             System.out.println("ilk iki karakter: " + takipKodlari[i].substring(0,2));

             for (int j = 1; j < takipKodlari[i].length(); j++) {
                 char c = takipKodlari[i].charAt(j);
                 if (Character.isLetter(c)) {
                     harfSayisi++;

                 } else if (Character.isDigit(c)) {
                     rakamSayisi++;
                 }
             }
         }
        System.out.println("toplam harf: " + harfSayisi);
         System.out.println("toplam rakam: " + rakamSayisi);
    }
}
