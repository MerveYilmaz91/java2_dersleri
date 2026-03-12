package JavaOdev2;

import java.util.Scanner;

public class soru7_sinemaBiletleme {
    public static void main(String[] args) {
        /**
         * Sinema Biletleme:
         * Kullanıcıdan kaç bilet alacağını al ve her bilet için film adını bir diziye kaydet.
         * Kullanıcıdan salon türünü al: "2d", "3d", "imax".
         * Salon türüne göre bilet fiyatı belirle.
         * Kullanıcıdan yaş grubunu al: "çocuk", "öğrenci", "yetişkin", "65+" ve indirimi uygula.
         * Her film için kaç bilet alındığını sayıp raporla.
         * Film adlarında aynı filmin farklı yazımları varsa (ör. büyük/küçük harf farkı),
         * sayımda aynı kabul et.
         **/

        Scanner scanner=new Scanner(System.in);
        System.out.println("kaç bilet alacaksınız: ");
        int biletSayisi=scanner.nextInt();
        scanner.nextLine();

        String [] filmler = new String[biletSayisi];
        for(int i=0;i<biletSayisi;i++){
            System.out.println((i+1)+ " . film adını girin: ");
            filmler[i]=scanner.nextLine().trim().toLowerCase();
        }
        System.out.println("salon türünü girin: 2d / 3d / imax ");
        String salonTuru = scanner.nextLine().trim().toLowerCase();

        double fiyat = 0;

        if(salonTuru.equals("2d")) {
            fiyat = 50;
        } else if(salonTuru.equals("3d")){
            fiyat = 100;
        }else if(salonTuru.equals("imax")){
            fiyat = 200;
        } else {
            System.out.println("geçersiz salon türü girdiniz.");
        }

        System.out.println("yas grubu giriniz: cocuk / öğrenci / yetişkin / 65+ ");
        String yasGrubu = scanner.nextLine().trim().toLowerCase();

        double indirimOrani = 0;

        if (yasGrubu.equals("cocuk")) {
            indirimOrani = 0.50;
        } else if (yasGrubu.equals("öğrenci")) {
            indirimOrani = 0.30;
        } else if (yasGrubu.equals("yetişkin")) {
            indirimOrani = 0.10;
        } else if (yasGrubu.equals("65+")) {
            indirimOrani = 0.25;
        } else {
            System.out.println("geçersiz yaş gurubu girdiniz.");
        }
        double indirimliFiyat = fiyat - (indirimOrani * fiyat);
        double toplamTutar = indirimliFiyat * biletSayisi;

        System.out.println("bilet fiyatınız: " + indirimliFiyat);
        System.out.println("Toplam Tutar: " + toplamTutar);

    }
}
