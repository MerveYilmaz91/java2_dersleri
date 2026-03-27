package gun21;

public class KargoHesaplama {

    public static void urunYazdir (String urun, double kilo) {
        System.out.println("----ürün bilgileri-----");
        System.out.println("ürün adı: "  + urun);
        System.out.println("ürün kilosu: " + kilo);

    }
    public static double fiyatHesapla (double kilo) {
        return kilo * 20;
    }
    public static void kargoUcretiYazdir (double toplamkilo) {
        double toplam = fiyatHesapla(toplamkilo);
        System.out.println("toplam kargo ücreti: " + toplam);


    }


    public static void main(String[] args) {
        String urun1 = "kitap";
        double kilo1 = 5.2;

        String urun2 = "laptop";
        double kilo2 = 6.3;

        urunYazdir(urun1, kilo1);
        urunYazdir(urun2, kilo2);


        double toplamKilo = kilo1 + kilo2;
        kargoUcretiYazdir(toplamKilo);




    }
}
