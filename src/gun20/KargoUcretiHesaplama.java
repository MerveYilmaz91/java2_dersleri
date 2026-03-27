package gun20;

import java.util.Scanner;

public class KargoUcretiHesaplama {

    public static double fiyatBul(String gonderiTuru) {
        if (gonderiTuru.equalsIgnoreCase("standart")) {
            return 20;
        }else if(gonderiTuru.equalsIgnoreCase("hızlı")){
            return 40;
        }else if (gonderiTuru.equalsIgnoreCase("ekspres")){
            return 60;
        }else {
            return 0;
        }
    }

    public static double agirlikUcretiHesaplama(Double kilo) {
        if (kilo <= 1) {
            return 0;
        }else {
            return (kilo -1) * 20;
        }
    }

    public static double sehirDisiUcretHesapla(String sehirDisiMi) {
        if (sehirDisiMi.equalsIgnoreCase("evet")) {
            return 60;
        }else {
            return 0;
        }
    }

    public static void ucretOzeti(String gonderiTuru, double kilo, double temelUcret, double ekUcret, String sehirDisiMi, double toplamUcret) {
        System.out.println("---özet---");
        System.out.println("gönderi türü: " +  gonderiTuru);
        System.out.println("ağırlık: " + kilo);
        System.out.println("temel ücret: "  + temelUcret);
        System.out.println("ağırlık ek ücret: " + ekUcret);
        System.out.println("sehir dışı mı" + sehirDisiMi);
        System.out.println("toplam ücret" +  toplamUcret);
    }

    public static void main(String[] args) {

        /**
         * Bir kargo firmasında müşteri:
         * gönderi türünü girsin (standart, hizli, ekspres)
         * paketin ağırlığını girsin
         * şehir dışına gönderilip gönderilmeyeceğini girsin (evet / hayir)
         * Program şunları yapsın:
         * Gönderi türüne göre temel ücreti bulan bir method olsun
         * Ağırlığa göre ek ücreti hesaplayan bir method olsun
         * Şehir dışı durumuna göre ekstra ücret hesaplayan bir method olsun
         * Son ücreti ekrana düzenli şekilde yazdıran bir method olsun
         * */
        Scanner scanner = new Scanner(System.in);
        System.out.println("gönderi türü seçin: standart, hizli, ekspres ");
        String gonderiTuru = scanner.nextLine().trim();

        System.out.println("paket ağırlığı: ");
        double kilo = scanner.nextDouble();

        scanner.nextLine();

        System.out.println("sehir dışı mı? ");
        String sehirDisiMi = scanner.nextLine().trim();

        double temelUcret = fiyatBul(gonderiTuru);

        if (temelUcret == 0 ) {
            System.out.println("hatalı gönderi türü seçtiniz.");
        }else {
            double agirlikUcreti = agirlikUcretiHesaplama(kilo);

            double sehirDisi = sehirDisiUcretHesapla(sehirDisiMi);

            double toplam =  temelUcret + agirlikUcreti +  sehirDisi;

            ucretOzeti(gonderiTuru, kilo,temelUcret, agirlikUcreti, sehirDisiMi, toplam);


        }





    }
}
