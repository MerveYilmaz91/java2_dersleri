package gun27.ornek7;

public class MainClass {
    public static void main (String[] args) {
        /**
         * bir spor salonunda öğrenciler farklı üyelik paketleri seçebiliyorlar.
         * aylık, 3 aylık ve yıllık olacak şekilde.
         * her paketin farklı ücreti var.
         * üye oluştururken öğrenci adı ve paket giriliyor.
         * toplam ücret hesaplanıp ekrana yazdırılıyor.
         **/

        SporSalonuUyesi uye = new SporSalonuUyesi("merve" , UyelikPaketi.YILLIK);
        uye.bilgiYazdir();



    }
}
