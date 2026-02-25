package gun6;

import java.util.Scanner;

public class KargoTakipUygulamasi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Takip Kodu: ");
        String takipKodu = scanner.nextLine().trim();

        System.out.println("Teslim nereye olacak? (ev, ofis, sube ");
        String teslimYeri = scanner.nextLine().trim().toLowerCase();

        System.out.println("Mesafe");
        double mesafe = scanner.nextDouble();
        // scanner.nextline() -> buffer temizlemeye burada ihtiyaç yok
        // çünkü string den sonra int (sayisal deger) kullanımında sikinti oluşmuyor.

        if (takipKodu.length() != 10) {
            System.out.println("Takip Kodu Yanlis veya eksik");
            // simdilik uygulamayı durduramadık- ileride durdurabilecegiz
            //break kullanımı switch yada dongülerde oluyor.

            double fiyat = 0;
            switch (teslimYeri) {
                case "ev":
                    fiyat = 40;
                    break;
                case "ofis":
                    fiyat = 30;
                    break;
                case "sube":
                    fiyat = 20;
                    break;
                default:
                    System.out.println("Gecersiz teslim tipi");
            }
            if (mesafe > 30) {
                fiyat += 20;
            }
            String kodParcasi = takipKodu.substring(0, 2);
        }
    }
}




