package gun29.ornek1;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
    public static void main (String[] args) {
        /**
         * Bir araç kiralama şirketinde tüm araçlar için ortak olarak, plaka, marka,günlük ücret ve kirada
         * olup olmama durumu bilgisi tutuluyor.
         * ancak şirketin farklı araç türleri var:
         * otomobil için bagaj hacmi
         * motorsiklet için kask verilip verilmediği,
         * kamyonet için taşıma kapasitesi
         * kullanıcıdan araç bilgileri alınacak.
         * Daha sonra kiralanmak istenen aracın bilgileri ekrana yazdırılacak.
         * Eğer araç zaten kiradaysa kullanıcıya uygun bir mesaj verilecek.
         * Ayrıca marka bilgisinin içinde geçen belirli bir kelime kontrol edilerek
         *özel kampanya uygulanacak.
         **/

        Scanner scanner = new Scanner(System.in);

        Otomobil otomobil = new Otomobil("24 asm 91", "mercedes", 500, true,25);
        Motorsiklet motorsiklet = new Motorsiklet("45dld55", "bmw", 500, false,true);
        Kamyonet kamyonet = new Kamyonet("45slls", "volvo",420,false,120);

        //tüm nesneler araç olduğu için tek bir liste içerisinde toplayabildik.

        ArrayList<Arac> araclar = new ArrayList<>();
        araclar.add(otomobil);
        araclar.add(motorsiklet);
        araclar.add(kamyonet);

        System.out.println("kiralamak istediğiniz aracın markasını girin: ");
        String marka = scanner.nextLine().trim();

        boolean aracVarmi = false;

        for (Arac arac : araclar) {
            if (arac.getMarka().equalsIgnoreCase(marka)) {
                aracVarmi = true;
                arac.bilgiYaz();

                if (arac.isKiradaMi()) {
                    System.out.println("araç şuan kirada");
                }else {
                    System.out.println("araç kiralanabilir");
                }

                if (arac.getMarka().equalsIgnoreCase("volvo")) {
                    System.out.println("bu araç için indirim uygulanmaktadır.");
                }
            }

        }
        if (!aracVarmi) {
            System.out.println("aradığınız marka araç bizde bulunmamaktadır.");

        }



    }
}
