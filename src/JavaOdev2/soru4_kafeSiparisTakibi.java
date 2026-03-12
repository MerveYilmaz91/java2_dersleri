package JavaOdev2;

import java.util.Scanner;

public class soru4_kafeSiparisTakibi {
    public static void main(String[] args) {
        /**
         * Kafe Sipariş Takibi:
         * Kullanıcıdan 5 sipariş al: içecek adı ve boy (S/M/L).
         * İçecek adlarını bir diziye, boyları ayrı bir diziye kaydet.
         * İçecek türüne göre taban fiyat belirle (ör. kahve/çay/limonata/diğer).
         * Boy seçimine göre fiyatı güncelle.
         * Her sipariş için ödenecek tutarı ve gün sonunda toplam ciroyu yazdır.
         * Ayrıca içecek adlarında "şekerli" kelimesi geçiyorsa bunu tespit edip kaç tane olduğunu say.
         **/

        Scanner scanner = new Scanner(System.in);

        String [] icecekler = new String[5];
        String [] boylar = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + ". içeceği giriniz.");  //i+1 arrayler sıfırdan başladığı için +1 dedik
            icecekler[i] = scanner.nextLine();

            System.out.println("boy giriniz: L / M / S ");
            boylar[i] = scanner.nextLine();
        }
        double toplamCiro = 0;
        int sekerSayisi = 0;
        for (int i = 0; i < 5; i++) {
            double fiyat = 0;

            if (icecekler[i].equalsIgnoreCase("kahve")) {
                fiyat = 40;
            } else if (icecekler[i].equalsIgnoreCase("cay")) {
                fiyat = 20;
            } else if (icecekler[i].equalsIgnoreCase("limonata")) {
                fiyat = 30;
            }else if (icecekler[i].isEmpty()) {
                fiyat = 0;
            }else {
                fiyat = 35;
            }
            if (boylar[i].equalsIgnoreCase("L")) {
                fiyat += 15;
            }else if (boylar[i].equalsIgnoreCase("M")) {
                fiyat += 10;
            } else if (boylar[i].equalsIgnoreCase("S")) {
                fiyat += 5;
            }
            if(icecekler[i].toLowerCase().contains("şekerli")){
                sekerSayisi++;
            }
            toplamCiro += fiyat;
            System.out.println(icecekler [i] + "" + boylar[i] + "fiyat" + fiyat);
        }
        System.out.println("toplam ciro: " + toplamCiro);
        System.out.println("sekerli içecek sayısı: " + sekerSayisi);

    }
}
