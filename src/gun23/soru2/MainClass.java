package gun23.soru2;

public class MainClass {
    public static void main(String[] args) {
        /**
         * ad-numara ve ortalama bilgilerini tutan bir yapı oluşturun.
         * bir öğrenci oluşturup bilgilerini yazdırın.
         * ortalama 50 ve büyükse geçti, yoksa kaldı yazsın.
         **/

        Ogrenci ogrenci = new Ogrenci();
        ogrenci.ad = "Ali";
        ogrenci.numara = 15505;
        ogrenci.ortalama = 90;

        System.out.println("ilk dönem");
        ogrenci.bilgiYaz();
        ogrenci.sinavDurumu();

        System.out.println("ikinci dönem");
        ogrenci.ortalama=45;
        ogrenci.bilgiYaz();
        ogrenci.sinavDurumu();

    }
}
