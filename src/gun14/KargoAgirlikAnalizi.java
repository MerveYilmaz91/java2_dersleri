package gun14;

import java.util.ArrayList;
import java.util.Scanner;

public class KargoAgirlikAnalizi {
    public static void main(String[] args) {
        /** bir kargo şubesinde paket ağırlıkları tek tek giriliyor.
         * kullanıcı dan paket ağılıklarını kg cinsinden isteyin
         * kullanıcı 0 girerse giriş biter
         * negatif ağırlık girilirse uyarı verin ve listeye eklemeyin.
         *
         * kurallar:
         * 0 < ağırlık <= 2 ise "küçük paket"
         * 2 < ağırlık <= 5 ise "orta paket"
         * ağırlık > ise "büyük paket"
         * giriş bittikten sonra:
         * hiç paket girilmediyse: "hiç paket girilmedi." yazdırın
         * girildiyse:
         * tüm paketleri sıra numarası ile yazdırın.
         * küçük/orta/büyük paket sayısını yazdırın.
         * toplam ağırlıkları yazdırın.
         * ortalama ağırlıkları yazdırın.
         **/

        Scanner scanner = new Scanner(System.in);

        ArrayList<Double> agirliklar = new ArrayList<>();

        System.out.println("Paketin kilosunu girin. Çıkış için 0 girin");

        while (true) {
            System.out.println("agirlık: ");
            double kg = scanner.nextDouble();

            //çıkış yapmak için koşul
            if(kg==0){
                break;
            }
            if (kg<0) {
                System.out.println("negatif giriş olamaz. Tekrar deneyin");
                continue;
            }
            agirliklar.add(kg);
        }

        if (agirliklar.size()==0) {
            System.out.println("Hiç paket girilmedi");
        } else  {
            int kucuk = 0, orta= 0, buyuk = 0;
            double toplam = 0;

            System.out.println("---- paket listesi-----");
            for (int index=0; index<agirliklar.size(); index++) {

                toplam += agirliklar.get(index);
                String kategori;

                if (agirliklar.get(index) <= 2) {
                    kategori = "kucuk paket";
                    kucuk++;

                } else if (agirliklar.get(index) <= 5) {
                    kategori = "orta paket";
                    orta++;
                } else {
                    kategori = "buyuk paket";
                    buyuk++;
                }
                System.out.println((index+1) + ". paket ağirligi: " + agirliklar.get(index) + "kategori: " + kategori);

            }
            double ortalama = (double)toplam/agirliklar.size();

            System.out.println("----analiz-----");
            System.out.println("ortalama: " + ortalama);
            System.out.println("toplam ağırlık: " + toplam);
            System.out.println("kucuk paket sayisi: " + kucuk);
            System.out.println("orta paket sayisi: " + orta);
            System.out.println("buyuk paket sayisi: " + buyuk);

        }



    }
}
