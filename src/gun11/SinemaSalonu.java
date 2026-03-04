package gun11;

import java.util.Scanner;

public class SinemaSalonu {
    public static void main(String[] args) {
        /**
         * kullanıcıdan satır sayısı ve her satırdaki koltuk sayısını al
         * her koltuk için kullanıcı B(boş) veya D(dolu) girsin
         * her satır sonunda o satırdaki dolu koltuk sayısını yazdır.
         **/

        Scanner scanner =new Scanner(System.in);

        System.out.println("Satir sayisi: ");
        int satirSayisi = scanner.nextInt();

        System.out.println("Satirdaki koltuk sayisi: ");
        int satirdakiKoltukSayisi = scanner.nextInt();
        scanner.nextLine();

        for (int satir = 1; satir <= satirSayisi; satir++) {
            //her satırdaki dolu koltuk sayısı bilgisine ihtiyacım var
            //iç döngü bittiğinde yeni satura geçeceği için
            //o satırın dolu koltuk sayısı miktarını sıfırlamış oluyoruz.

            int doluKoltukSayisi = 0;
            System.out.print(satir + ". satir icin B/D gir");

            for (int koltukSayisi = 1; koltukSayisi <= satirdakiKoltukSayisi; koltukSayisi++) {
                System.out.println("Koltuk Bos mu Dolu mu (B/D)");
                String durum = scanner.nextLine().trim();
                if (durum. length() == 0) {
                    System.out.println("Bos giris yapildi. Koltuk dolu degil olarak kaydedildi");
                    continue;
                }

                //D giriş için burada equalsIgnoreCase kullanabiliriz. Kullanıcı d girerse diye
                // durum bilgisini alırken toUpperCase metodunu kullanabiliriz.

                if (durum.equalsIgnoreCase("D")) {
                    doluKoltukSayisi ++ ;

                } else if (durum.equalsIgnoreCase("B")) {
                    System.out.println("Gecersiz giris yapıldı, Koltuk dolu degil olarak kaydedildi");
                }
            }
            System.out.println("->" + satir + ". satirdaki dolu koltuk sayisi: "  + doluKoltukSayisi);
        }
    }
}
