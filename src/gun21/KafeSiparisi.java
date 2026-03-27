package gun21;

public class KafeSiparisi {
    public static int toplamHesapla(int birimFiyat, int adet) {
        return birimFiyat * adet;


    }

    public static void siparisYazdir(String icecek, int adet, int birimFiyat) {
        int toplam = toplamHesapla(birimFiyat, adet);

        System.out.println("-----fiş----");
        System.out.println("icecek: " + icecek);
        System.out.println("adet: " + adet);
        System.out.println("birim fiyatı: " + birimFiyat);
        System.out.println("toplam fiyat: " + toplam);
    }

    public static void main(String[] args) {
        // 1. müşteri siparişi:
        siparisYazdir("kahve", 2, 45);
        // 2. müşteri siparişi:
        siparisYazdir("çay", 4, 20);
        // 3. müşteri siparişi:
        siparisYazdir("sicak çikolata", 3, 50);
        // 4. müşteri siparişi:
        siparisYazdir("limonata",5 ,43);
    }
}

