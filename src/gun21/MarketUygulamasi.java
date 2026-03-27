package gun21;

public class MarketUygulamasi {

    public static void urunBilgisiYazdir(String urun, double fiyat, int adet) {
        System.out.println("-----urun bilgileri-----");
        System.out.println("ürün adi: " + urun);
        System.out.println("ürün fiyatı: " + fiyat);
        System.out.println("ürün miktarı: " + adet);
        System.out.println("----------");
    }

    public static double tutarHesapla(double fiyat, int adet) {
        return fiyat * adet;
    }

    public static void indirimHesapla(double toplam) {
        if (toplam >= 100) {
            double indirimli = toplam * 0.9;
            System.out.println("indirim uygulandı");
            System.out.println("indirimsiz toplam fiyat: " + toplam);
            System.out.println("indirimli toplam fiyat: " + indirimli);
        } else {
            System.out.println("indirim kazanamadınız.");
            System.out.println("toplam fiyat: " + toplam);
        }
    }

        public static void main(String[] args) {

        String urun1= "elma";
        double fiyat1 = 23.5;
        int adet1= 5;

        String urun2= "kivi";
        double fiyat2 = 45.5;
        int adet2= 3;

        urunBilgisiYazdir(urun1,fiyat1,adet1);
        urunBilgisiYazdir(urun2,fiyat2,adet2);

        double tutar1 = tutarHesapla(fiyat1, adet1);
        double tutar2 = tutarHesapla(fiyat2, adet2);

        System.out.println("1. ürün toplam fiyatı: " + tutar1);
        System.out.println("2. ürün toplam fiyatı: " + tutar2);

        double genelToplam = tutar1 + tutar2;

        indirimHesapla(genelToplam);



    }
}
