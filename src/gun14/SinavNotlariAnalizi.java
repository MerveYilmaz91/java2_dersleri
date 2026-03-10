package gun14;

import java.util.ArrayList;
import java.util.Scanner;

public class SinavNotlariAnalizi {
    public static void main(String[] args) {
        /** kullanıcıdan sınav notlarını tek tek alacak şekilde program yazın
         * kullanıcı 0 ile 100 arasında notlar girebilir.
         * kullanıcı -1 yazarsa not girişi biter ve analiz kısmına geçilir.
         *
         * kullanıcı 0-100 dışında (örn. 120,-5 gibi) bir değer girerse:
         * "geçersiz not" uyarısı verin.
         * bu not listeye eklemeyin.
         * tekrar not girişi isteyin.
         *
         * giriş tamamlandıktan sonra:
         * eger hiç geçerli not girilmediyse
         * "hiç not girilmedi. analiz yapılamaz" mesajı yazdırın.
         * eger en az 1 geçerli not girildiyse.
         * girilen notları sıra numarası ile yazdırın.
         *
         * notların ortalamasını hesaplayın. (ondalıklı olsun)
         * geçen (>= 50) ve kalan (<=50) sayısını yazdırın
         *
         * en yüksek ve en düşük notları yazdırın.
         **/

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> notlar = new ArrayList<>();

        System.out.println("0-100 arası not girin.Bitirmek için -1 girin");

        while(true){
            System.out.println("Not: ");
            int not = scanner.nextInt();

            // çıkış için koşul
            if(not==-1){
                break;

            }
            //hatalı not girişi için koşul
            if (not<0 || not>100){
                System.out.println("not aralığı 0-100 arası olmalı. tekrar deneyin.");
                continue; //kullanıcıdan yeniden not istiyoruz

            }
            notlar.add(not);
        }
        if (notlar.isEmpty()){  // notlar.size() == 0 da koşul olarak olur.
            System.out.println("hiç not girilmedi. analiz yapın.");

        }else {
            int toplam = 0;
            int gecenSayisi = 0;
            int kalanSayisi = 0;

            int enYuksekNot = notlar.get(0);
            int enDusukNot = notlar.get(0);
            for (int i=0 ; i < notlar.size(); i++) {
                toplam += notlar.get(i);

                if (notlar.get(i) >= 50) {
                    gecenSayisi++;

                } else {
                    kalanSayisi++;
                }

                if (notlar.get(i) > enYuksekNot) {
                    enYuksekNot = notlar.get(i);

                }
                if (notlar.get(i) < enDusukNot) {
                    enDusukNot = notlar.get(i);
                }
            }
            double ortalama = (double) toplam / notlar.size();

            System.out.println("-------notlar--------");
            for (int i = 0; i< notlar.size(); i++) {
                System.out.println((i+1) + ". not: " + notlar.get(i));
            }
            System.out.println("-----analiz sonuçları-----");
            System.out.println("ortalama: " + ortalama);
            System.out.println("geçen sayısı: " + gecenSayisi);
            System.out.println("kalan sayısı: " + kalanSayisi);
            System.out.println("en yuksek notlar: " + enYuksekNot);
            System.out.println("en dusuk notlar: " + enDusukNot);

        }
        scanner.close();
    }
}
