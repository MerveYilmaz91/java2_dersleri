package gun25.ornek1;

public class ConstructorKonusu {
    public static void main(String[] args) {
        /**
         * Constructor, bir class tan nesne ürettigimiz anda otomatik
         * calisan yapidir.
         * Nesne olustururken baslangic degerleri verilebilir, ortak islemler
         * yapilabilir.
         *
         * Özellikleri ->
         * 1) Class ismiyle ayni olmali
         * 2) Geri dönüs tipi yoktur, ama buna ragmen void de yazilmaz
         * 3) Nesne olustururken otomatik olusur.
         * 4) Istenirse parametre eklenebilir
         *
         * class Araba {
         *
         *     Araba() {
         *         System.out.println("Araba nesnesi olusturuldu");
         *     }
         * }
         *  Araba araba = new Araba();
         * */

        Araba araba = new Araba();

        Ogrenci ogrenci = new Ogrenci();

        //ad ve yaş için burada bir atama yapmadık.
        // gelen değerler constructor metod dan otomatik geliyor

        System.out.println("ad: " + ogrenci.ad);
        System.out.println("yaş: " + ogrenci.yas);


        System.out.println("-----------");
        Ogrenci ogrenci1 = new Ogrenci("mehmet", 32);

        System.out.println("isim: " + ogrenci1.ad);
        System.out.println("yas: " + ogrenci1.yas);

        System.out.println("------------");
        Kitap kitap = new Kitap("fareler ve insanlar");

        Kitap kitap1 = new Kitap();
        kitap1.ad = "calikusu";

        System.out.println(kitap.ad);
        System.out.println(kitap1.ad);


    }
}
