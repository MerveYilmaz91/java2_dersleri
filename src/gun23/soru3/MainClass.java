package gun23.soru3;

public class MainClass {
    public static void main(String[] args) {
        /**
         * marka,renk ve hız bilgilerini tutan bir yapı oluşturun.
         * önce mevcut hız bilgileriniz yazdırın.
         * hızı 20 artttırın ve hızı 120 yi geçerse uyarı verdirin.
         **/

        Araba araba = new Araba();
        araba.marka = "BMW";
        araba.renk = "kırmızı";
        araba.hiz = 110;

        System.out.println("ilk durum: ");
        araba.bilgiYazdir();

        araba.hizlan();

        System.out.println("hızlandıktan sonra: ");
        araba.bilgiYazdir();
    }
}
