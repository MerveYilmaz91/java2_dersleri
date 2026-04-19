package gun29.ornek3;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        /**
         * Bir restoranda tüm ürünlerin ortak olarak ad, fiyat ve kategori bilgisi bulunuyor.
         * Fakat ürünler kendi içinde ayrılıyor:
         * İçecek için litre bilgisi
         * Tatlı için şerbetli olup olmama bilgisi
         * Ana yemek için acılık seviyesi
         * Menüye birkaç ürün eklenecek.
         * Kullanıcıdan bir ürün adı alınacak ve ürün menüde varsa bilgileri gösterilecek.
         * Aynı isimde tekrar ürün eklenmek istenirse uygun uyarı verilecek.
         * Ayrıca kategoriye göre kaç ürün olduğu bulunacak.
         **/

        Scanner scanner = new Scanner(System.in);

        Icecek icecek = new Icecek("limonata", 25,"icecek", 0.5);
        Icecek icecek1 = new Icecek("kahve", 75,"icecek", 0.9);
        Tatli tatli = new Tatli("kadayıf dolması",45,"tatlı",true);
        AnaYemek anaYemek = new AnaYemek("iskender",60,"ana yemek", 3);

        ArrayList<Urun> urunler = new ArrayList<>();

        urunler.add(icecek);
        urunler.add(icecek1);
        urunler.add(tatli);
        urunler.add(anaYemek);

        System.out.println("hangi yemeği istersiniz");
        String arananurun = scanner.nextLine().trim();

        for (Urun urun : urunler) {
            if (urun.getAd().equalsIgnoreCase(arananurun)) {
                urun.bilgiyaz();

            }
        }

        System.out.println("yeni ürün ismi girin : ");
        String yeniUrun = scanner.nextLine().trim();
        boolean varMi = false;

        for (Urun urun : urunler) {
            if (urun.getAd().equalsIgnoreCase(yeniUrun)) {
                varMi = true;
                break;
            }

        }

        if (varMi) {
            System.out.println("bu isimde ürün menude vardır");
        }else {
            System.out.println("ürün menuye eklenebilir.");
        }

        int icecekMiktari = 0;
        int tatlimiktari = 0;
        int anaYemekmiktari = 0;

        for (Urun urun : urunler) {
            if (urun.getKategori().equalsIgnoreCase("icecek")) {
                icecekMiktari ++;
            }else if (urun.getKategori().equalsIgnoreCase("tatlı")) {
                tatlimiktari ++;
            }else {
                anaYemekmiktari ++;
            }
        }

        System.out.println("içicek mikatarı: " + icecekMiktari);
        System.out.println("tatlı miktarı: " + tatlimiktari);
        System.out.println("ana yemek miktarı: " + anaYemekmiktari);



    }
}
