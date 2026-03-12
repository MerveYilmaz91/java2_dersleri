package JavaOdev2;

import java.util.Scanner;

public class MarketAlisverisListesi {
    public static void main(String[] args) {
        /**
         * Kullanıcıdan kaç ürün gireceğini al. Her ürün için ürün adını iste ve bir listeye ekle.
         * Sonra kullanıcıdan bir kategori seçmesini iste: "meyve", "sebze", "atıştırmalık",
         * "içecek".
         * Seçime göre, listede geçen ürün adlarında bazı düzenlemeler yap:
         * Ürün adının başındaki/sonundaki boşlukları temizle.
         * Ürün adını ekrana daha düzenli biçimde yazdır (ör. ilk harfi büyük).
         * Son olarak, listedeki ürünlerin kaç tanesinde rakam geçtiğini sayıp ekrana yazdır
         **/

        Scanner scanner = new Scanner(System.in);

        System.out.println("kaç ürün gireceksiniz: ");
        int urunSayisi = scanner.nextInt();
        scanner.nextLine();

        String[] urunler = new String[urunSayisi];

        for (int i = 0; i < urunSayisi; i++) {
            System.out.println((i + 1) + ". ürün adı giriniz: ");
            urunler[i] = scanner.nextLine().trim().toLowerCase();
        }

        System.out.println("kategori seçin: meyve / sebze / atıştırmalık / içecek");
        String kategori = scanner.nextLine().trim().toLowerCase();

        int sayac = 0;

        for (int j = 0; j < urunler.length; j++) {
            String urun = urunler[j];

            urun = urun.substring(0, 1).toUpperCase() + urun.substring(1);
            System.out.println(urun);

            for (int z = 0; z < urun.length(); z++) {
                if (Character.isDigit(urun.charAt(z))) {
                    sayac++;
                    break;
                }
            }
        }

        System.out.println("Rakam geçen ürün sayısı: " + sayac);


    }

}
