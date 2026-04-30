package gun34.ornek3;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        /**
         * Bir banka uygulaması geliştirilecektir.
         * Sistemde farklı hesap türleri vardır:
         * vadesiz hesap
         * öğrenci hesabı
         * birikim hesabı

         * Her hesapta:
         * hesap sahibi adı
         * hesap numarası
         * bakiye
         * bulunacaktır.

         * Kurallar:
         * Para yatırma ve para çekme işlemleri yapılmalıdır.
         * Hesap türlerine göre işlem kuralları değişebilir.
         * örneğin öğrenci hesabında işlem ücreti alınmayabilir
         * birikim hesabında belirli limit altına düşülemeyebilir
         * Bir hesaptan başka bir hesaba para transferi yapılmalıdır.

         * Aşağıdaki durumlarda hata yönetimi yapılmalıdır:
         * negatif para yatırma
         * bakiyeden fazla para çekme
         * geçersiz hesap numarasına transfer
         * Tüm hesaplar bir listede tutulmalı ve hesap özeti ekrana yazdırılmalıdır.
         **/

        List<Hesap> hesaplar = new ArrayList<>();

        Hesap hesap1 = new vadesizHesap("merve","1001",5000);
        Hesap hesap2 = new ogrenciHesabi("asya", "1002",2000);
        Hesap hesap3 = new birikimHesabi("serdar","1003",3000);

        hesaplar.add(hesap1);
        hesaplar.add(hesap2);
        hesaplar.add(hesap3);

        try {
            hesap1.paraYatir(1000);
            hesap2.paraCek(500);
            hesap1.transfer(hesap2,700);
            hesap3.paraCek(2500);
        }catch (Exception e) {
            System.out.println("hata: " + e.getMessage());
        }

        System.out.println("\n ----Hesap özeti ----");
        for (Hesap hesap : hesaplar) {
            hesap.hesapOzeti();
        }
    }
}
