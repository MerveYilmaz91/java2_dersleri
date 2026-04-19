package gun26.ornek2;

public class MainClass {
    public static void main(String[] args) {
        /**
         * bir banka hesanı sınıfı oluşturun.
         * bakiye alanı private olsun
         * para yatırma ve para çekme işlemlerini kontrollü bir şekilde gerçekleştirin.
         **/

        BankaHesabi bankaHesabi = new BankaHesabi(500);

        bankaHesabi.paraYatirma(1000);
        bankaHesabi.paraYatirma(500);
        bankaHesabi.paraCekme(2000);
        bankaHesabi.paraCekme(1400);
    }
}
