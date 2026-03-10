package gun14;

import java.util.ArrayList;
import java.util.Scanner;

public class MarketAlisverisi {
    public static void main(String[] args) {
        /** bir kullanıcıdan kaç ürün alınacağını öğrenin
         * her ürün için;
         * ürün adı alın
         * ürün fiyatını alın
         * tüm ürünleri bir listede tutun.
         * sonunda: ürünleri sırayla yazdırın.
         * toplam tutarı hesaplayın.
         * kullanıcının verdiği bütçe ile karşılaştırın.
         * kurallar:
         * ürün adı boş girilirse tekrar isteyin.
         * fiyat 0 veya negatif olamaz.
         * toplam bütçe aşılmışsa "bütçe aşıldı", aşılmadıysa "bütçe uygun" yazdırın.
         **/

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> urunler = new ArrayList<>();
        ArrayList<Double> fiyatlar = new ArrayList<>();

        System.out.println("kaç ürün alacaksınız: ");
        int adet = scanner.nextInt();

        System.out.println("bütçeniz: ");
        double butce = scanner.nextDouble();

        scanner.nextLine();

        double toplam = 0;
        for (int i = 0; i < adet; i++) {

            String urunAdi;
            while (true) {
                System.out.println((i + 1) + ". ürün adi: ");
                urunAdi = scanner.nextLine();

                if (urunAdi.isEmpty()) {
                    System.out.println("ürün adi boş olamaz. Tekrar girin");
                } else {
                    break;
                }
            }
            double tutar;
            while (true) {
                System.out.println((i + 1) + ". ürün fiyatı: ");
                tutar = scanner.nextDouble();
                scanner.nextLine();
                if (tutar <= 0) {
                    System.out.println("ürün fiyatı 0 yada negatif olamaz. tekrar deneyin ");
                } else {
                    break;
            }
            }

            urunler.add(urunAdi);
            fiyatlar.add(tutar);

            toplam += tutar;
        }

        System.out.println("---------alışveriş listesi--------");
        for (int i = 0; i < urunler.size(); i++) {
            System.out.println((i+1) + ". urun adi: " + urunler.get(i) + "ürünün fiyatı: " + fiyatlar.get(i));
        }
        System.out.println("toplam tutar: " + toplam);
        System.out.println("bütçe: " + butce);

        String durum = (toplam > butce) ? "bütçe aşıldı" : "bütçe uygun" ;
        System.out.println(durum);

        /*
        if (toplam > butce) {
            System.out.println("bütçe aşıldı");
        }else {
            System.out.println("bütçe uygun");
        }
        */

    }
}
