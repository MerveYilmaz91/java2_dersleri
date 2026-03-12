package JavaOdev2;

import java.util.Scanner;

public class soru6_evEnerjiTüketimi {
    public static void main(String[] args) {
        /**
         * Ev Enerji Tüketimi Analizi:
         * Kullanıcıdan 12 aylık elektrik tüketimini (kWh) alıp bir diziye kaydet.
         * Kullanıcıdan tarife seçimi al: "gündüz", "gece", "karma".
         * Seçime göre birim fiyat belirle.
         * Yıllık toplam maliyeti hesapla.
         * Ayrıca, ortalamanın üstünde olan ayların kaç tane olduğunu say ve bu ayları "Ocak,Şubat..." şeklinde yazdır.
         **/

        Scanner scanner = new Scanner(System.in);

        double [] tuketim = new double [12];
        String [] aylar = {"Ocak", "Şubat", "Mart", "Nisan", "Mayıs", "Haziran", "Temmuz",
                "Ağustos", "Eylül", "Ekim", "Kasım", "Aralık"};

        double toplamTuketim = 0;

        for (int i = 0; i < 12; i++) {
            System.out.println(aylar[i] + " ayı tüketimini girin (kwh): ");
            tuketim[i] = scanner.nextDouble();
            toplamTuketim += tuketim[i];
        }
        scanner.nextLine();

        System.out.println("tarife seçin: gündüz / gece / karma ");
        String tarife =scanner.nextLine().trim().toLowerCase();
        double birimFiyat = 0;

        if (tarife.equals("gündüz")) {
            birimFiyat = 2.5;
        } else if (tarife.equals("gece")) {
            birimFiyat = 1.5;
        }else if (tarife.equals("indirimli")) {
            birimFiyat = 1.8;
        }else {
            System.out.println("geçersiz tarife girdiniz.");
        }
        double toplamMaliyet = toplamTuketim * birimFiyat;
        double ortama =  toplamMaliyet / 12;

        System.out.println("yıllık toplam tüketim: " + toplamMaliyet + "kwh");
        System.out.println("yıllık toplam maliyet: " + toplamMaliyet + "TL");
        System.out.println("aylık ortalama tüketim: " + ortama + "kwh");

        int ustundeyseAySayisi = 0;

        System.out.println("ortalama üzerinde olan aylar: ");
        for (int i = 0; i < 12; i++) {
            if (tuketim[i] > ortama) {
                System.out.println(aylar[i]);
                ustundeyseAySayisi++;

            }
        }
        System.out.println("ortalamanın uzerinde olan ay sayısı: " + ustundeyseAySayisi);


    }
}
