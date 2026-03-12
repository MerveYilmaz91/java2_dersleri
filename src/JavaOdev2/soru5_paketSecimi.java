package JavaOdev2;

import java.util.Scanner;

public class soru5_paketSecimi {
    public static void main(String[] args) {
        /**
         * Telefon Operatörü Paket Seçimi:
         * Kullanıcıdan 6 aylık internet kullanımlarını (GB) alıp bir diziye kaydet.
         * Kullanıcıdan paket tipini al: "mini", "standart", "premium".
         * Paket tipine göre aylık kota belirle.
         * Her ay için kota aşıldı mı kontrol et; aşıldıysa aşım miktarını yazdır.
         * En çok aşım olan ayı bul.
         * Ayrıca kullanıcıdan müşteri numarasını al; numaranın uzunluğu belirli değilse hata
         * mesajı ver ve numara içinde kaç tane rakam olduğunu say.
         **/

        Scanner scan = new Scanner(System.in);
        System.out.println("6 aylık internet kullanımlarınızı (GB) girin");
        double [] internetKullanimi = new double[6];

        for (int i=0; i<6; i++){
            System.out.println((i+1)+ ".ay internet kullanımını gir: ");
            internetKullanimi[i] = scan.nextDouble();
        }

        System.out.println("paket tipini seçin : mini / standart / premium");
        String paket = scan.next().toLowerCase().trim();

        double kota = 0;

        if (paket.equals("mini")){
            kota = 500;
        } else if (paket.equals("standart")){
            kota = 1000;
        }else if (paket.equals("premium")){
            kota = 1500;
        }else {
            System.out.println("geçersiz paket seçimi");
        }

        for (int i=0; i<6; i++){
            if (internetKullanimi[i] > kota){
                double asim = internetKullanimi[i] -  kota;
                System.out.println((i+1) + ". ay kotayı aştı. Aşım: " + asim + "GB");
            }
        }
        // en çok aşım olan ay için
        double enBuyukAsim = 0;
        int enCokAsimAy= 0;

        for (int i=0; i<6; i++){
            if (internetKullanimi[i] > kota){
                double asim = internetKullanimi[i] -  kota;
                System.out.println((i+1) + " . ay kota aşıldı. aşım:  " + asim + "GB");

                if (asim > enBuyukAsim){
                    enBuyukAsim = asim;
                    enCokAsimAy = i+1;
                }
            }
        }
        if (enBuyukAsim > 0 ){
            System.out.println("en çok aşım olan ay: " + enBuyukAsim + ". ay");
        } else {
            System.out.println("hiç aşım olmadı");
        }

        //müşteri numarası için

        System.out.println("müşteri numarası girin: ");
        String musteriNo = scan.next().trim();

        if (musteriNo.length()!= 10){
            System.out.println("hata. müşteri numarası 10 haneli olmalıdır.");
        }
        int rakamSayisi = 0;
        for (int i=0; i<musteriNo.length(); i++){
            char ch = musteriNo.charAt(i);

            if(Character.isDigit(ch)){   //bu karakter rakam mı
                rakamSayisi++;    // kaç tane rakam olduğunu saymak için kullandım
            }
        }
        System.out.println("müşteri numarasındaki rakam sayısı: " + rakamSayisi);
    }
}
