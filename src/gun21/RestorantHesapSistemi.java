package gun21;

public class RestorantHesapSistemi {
    public static int toplamHesapla(int adet, int birimFiyat){
        return birimFiyat * adet;
    }
    public static void hesapYazdir(String urunAdi,int adet, int birimFiyat) {
        int toplam = toplamHesapla(adet, birimFiyat);
        System.out.println("----fiş----");
        System.out.println("ürün adı: " + urunAdi);
        System.out.println("adet: " + adet);
        System.out.println("birim fiyat: " + birimFiyat);
        System.out.println("toplam tutar: " + toplam);
    }
    public static void main(String[] args) {

        //ürün adı- adet- birim fiyat
        //1. müşteri
        hesapYazdir("pizza",3,50);
        //2. müşteri
        hesapYazdir("hamburger",4,80);
        //3. müşteri
        hesapYazdir("döner",4,100);
        //4. müşteri
        hesapYazdir("kebap",5,120);

    }
}
