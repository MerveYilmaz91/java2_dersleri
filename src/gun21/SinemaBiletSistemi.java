package gun21;

public class SinemaBiletSistemi {
    public static int toplamHesapla(int adet, int BirimFiyat) {
        return adet * BirimFiyat;
    }
    public static void biletBilgisiYazdir(String isim,String filmAdı, int adet, int birimFiyat) {
        int toplam =  toplamHesapla(adet, birimFiyat);
        System.out.println("----fiş-----");
        System.out.println("isim: " + isim);
        System.out.println("film adı: " + filmAdı);
        System.out.println("adet: " + adet);
        System.out.println("birim fiyat: " + birimFiyat);
        System.out.println("toplam tutar: " + toplam);
    }
    public static void main(String[] args) {
        //kişi , adet, birim fiyat
        biletBilgisiYazdir("ali" ,"elmalar" ,2, 400);
        biletBilgisiYazdir("veli" ,"armutlar",1, 200);
        biletBilgisiYazdir("ali" , "çilekler" ,4, 300);
        biletBilgisiYazdir("ali" , "muzlar" , 3, 250);
    }
}
