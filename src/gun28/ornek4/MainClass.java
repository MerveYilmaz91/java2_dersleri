package gun28.ornek4;

import java.util.Scanner;

public class MainClass {
    public static void main (String[] args) {
        /**
         * bir araç kiralama şirketinde bütün araçların ortak olarak plaka, marka, ve günlük ücret bilgileri vardır.
         * arabaların ayrıca kapı sayısı, motorsikletlerin ise kask dahil mi bilgisi vardır.
         * bu bilgilere göre classları oluşturun.
         **/

        Scanner scanner = new Scanner(System.in);

        System.out.println("kaç araba kiralamak istiyorsunuz: ");
        int arabaSayisi = scanner.nextInt();
        scanner.nextLine();

        Araba [] arabas = new Araba[arabaSayisi];

        for (int index=0; index < arabas.length; index ++) {
            System.out.print((index + 1) + ". araba plakasını girin: ");
            String plaka = scanner.nextLine().trim();

            System.out.print((index + 1) + ". araba markasını girin: ");
            String marka = scanner.nextLine().trim();

            System.out.print((index + 1) + ". araba günlük ücretini girin: ");
            double ucret = scanner.nextDouble();

            System.out.print((index + 1) + ". araba kapı sayısını girin: ");
            int kapiSayisi = scanner.nextInt();
            scanner.nextLine();

            arabas [index] = new Araba(plaka, marka, ucret,kapiSayisi);

        }

        for (Araba araba : arabas) {
            araba.bilgiYaz();
        }
    }
}
