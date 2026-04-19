package gun23.soru1;

public class MainClass {
    public static void main(String[] args) {
        /**
         * marka, model ve sarj yüzdesi bilgilerini tutan bir yapı oluşturun.
         * bir telefon oluşturup bilgilerini yazdırın.
         * sarj yüzdesini 10 arttırıp bilgilerini tekrar yazdırın.
         **/

        Telefon telefon = new Telefon();
        telefon.marka = "iphone";
        telefon.model = "17 PRO";
        telefon.sarjYuzdesi = 40;

        System.out.println("ilk durum bilgileri: ");
        telefon.bilgileriniYazdir();

        telefon.sarjiArttir();

        System.out.println("sarj edildikten sonra: ");
        telefon.bilgileriniYazdir();
    }
}
