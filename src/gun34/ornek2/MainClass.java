package gun34.ornek2;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main (String[] args) {
        /**
         * Bir kütüphane otomasyonu geliştirilecektir.
         * Sistemde:
         * kitaplar
         * üyeler
         * ödünç alma işlemleri yer alacaktır.

         * Her kitabın:
         * kitap adı
         * yazar adı
         * sayfa sayısı
         * mevcut durumu olacaktır.

         * Kurallar:
         * Kitap ve dergi gibi farklı yayın türleri oluşturulmalıdır.
         * Her yayın için bilgileri gösteren ortak bir yapı bulunmalıdır.
         * Bir üye bir yayını ödünç almak istediğinde:
         * yayın zaten ödünçteyse hata verilmelidir
         * üyelik aktif değilse hata verilmelidir
         * Yayın iade edildiğinde tekrar uygun hale gelmelidir.
         * Sistemde birden fazla yayın bir listede tutulmalıdır.
         * Kullanıcı hatalı bir seçim yaptığında program çökmemelidir,
         * uygun mesaj verilmelidir.
         **/

        List<Yayin> yayinlar = new ArrayList<>();

        Yayin kitap1 = new Kitap("suç ve ceza", "dostoyevski", 230, true);
        Yayin kitap2 = new Kitap("yarının adamı", "yabanci", 300, false);

        Yayin dergi1 = new Dergi("dergi1", "yazar1", 50, false);
        Yayin dergi2 = new Dergi("dergi2", "yazar2", 25, false);

        yayinlar.add(kitap1);
        yayinlar.add(kitap2);

        yayinlar.add(dergi1);
        yayinlar.add(dergi2);

        Uye uye1 = new Uye("kader", true);
        Uye uye2 = new Uye("merve", false);
        Uye uye3 = new Uye("asya", true);

        System.out.println("----YAYINLAR----");
        for (Yayin yayin : yayinlar) {
            yayin.bilgiGoster();
        }

        try {
            kitap2.oduncAl(uye2);
            kitap2.oduncAl(uye3);
        }catch (RuntimeException e) {
            System.out.println("hata: " + e.getMessage());
        }

        try {
            dergi1.oduncAl(uye1);
            dergi2.oduncAl(uye3);
        }catch (RuntimeException e) {
            System.out.println("hata: " + e.getMessage());
        }

        kitap2.iadeEt();

        System.out.println("güncel durum");
        for (Yayin yayin : yayinlar) {
            yayin.bilgiGoster();
            System.out.println();
        }





    }
}
