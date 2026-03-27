package gun20;

import java.util.Scanner;

public class kafeSiparisi {

    public static double fiyatBul(String icecek) {
        if(icecek.equalsIgnoreCase("kahve")){
            return 60.0;
        }else if(icecek.equalsIgnoreCase("çay")){
            return 40.0;
        } else if(icecek.equalsIgnoreCase("limonata")){
            return 20.0;
        }else {
            return 0.0;  //geçersiz içecek girdiği durumda
        }
    }

    public static double araToplam(double icecekFiyatı, int adet) {
        return icecekFiyatı * adet;
    }

    public static double indirimHesapla(double araToplam, String ogrenciMi) {
        if (ogrenciMi.equalsIgnoreCase("evet")) {
            return araToplam * 0.10;
        } else {
            return 0.0;
        }
    }

    public static void fisYazdir(String icecek, int adet, double araToplam, double indirim,double toplam) {
        System.out.println("---FİŞ---");
        System.out.println("içecek: " + icecek);
        System.out.println("adet: " + adet);
        System.out.println("ara toplam: " + araToplam);
        System.out.println("indirim: " + indirim);
        System.out.println("toplam: " + toplam);
    }

    public static void main(String[] args) {
        /**
         * Bir kafede müşteri:
         * içecek türünü girsin (kahve, cay, limonata)
         * adet girsin
         * öğrenci olup olmadığını girsin (evet / hayir)
         * Program şunları yapsın:
         * İçeceğin birim fiyatını bulan bir method olsun
         * Ara toplamı hesaplayan bir method olsun
         * Öğrenci ise indirim tutarını hesaplayan bir method olsun
         * En son ödenecek tutarı ekrana yazdırsın
         **/

        Scanner scanner = new Scanner(System.in);
        System.out.println("içecek türü seçin: kahve-çay-limonata");
        String icecek = scanner.nextLine().trim();

        System.out.println("adet girin: ");
        int adet = scanner.nextInt();

        scanner.nextLine();

        System.out.println("öğrenci misiniz? ");
        String ogrenciMi = scanner.nextLine().trim();

        double birimFiyat = fiyatBul(icecek);

        if (birimFiyat == 0.0) {
            System.out.println("geçersiz içecek girdiniz.");
        }else {
            double araToplam = araToplam(birimFiyat, adet);

            double indirim = indirimHesapla(araToplam, ogrenciMi);

            double toplam = araToplam - indirim;

            fisYazdir(icecek, adet, araToplam, indirim, toplam);  //bunu metodu yazdığın sıra ile yazman lazım. yoksa yanlış çıktı alır
            }
        scanner.close();
        }
    }

