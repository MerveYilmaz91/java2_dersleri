package gun28.ornek3;

public class MainClass {
    public static void main (String[] args) {

        /**
         * bir hastanede tüm çalışanların ortak ad, soyad ve maaş bilgileri vardır.
         * doktorların ayrıca uzmanlık alanı, hemşirelerin ise servis adı vardır.
         * bu bilgilere göre classları oluşturun.
         **/

        Doktor doktor = new Doktor("Asya", "Yilmaz", 100000, "cerrah");
        Hemsire hemsire = new Hemsire("Deren", "imal", 90000,"kulak burun");

        doktor.bilgiYazdir();
        hemsire.bilgiYazdir();
    }
}
