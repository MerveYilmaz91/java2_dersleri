package JavaOdev2;

import java.util.Scanner;

public class soru9_AntrenmanGunlugu {
    public static void main(String[] args) {
        /**
         * Spor Salonunda Antrenman Günlüğü:
         * Kullanıcıdan 7 gün için antrenman türünü al: "koşu", "ağırlık", "yüzme", "dinlenme"
         * ve bir diziye kaydet.
         * Her gün için dakika bilgisini alıp ayrı bir diziye kaydet.
         * Antrenman türüne göre yakılan kalori katsayısı belirle ve günlük kalorileri hesapla.
         * Toplam kalori, en yüksek kalori olan gün ve kaç gün "dinlenme" seçildiğini yazdır.
         * Ayrıca kullanıcıdan hedef metnini al (ör. "haftada 3 gün koşu"); metinde kaç kelime olduğunu say.
         **/

        Scanner scanner = new Scanner(System.in);

        String [] antrenmanTuru = new String[7];
        for (int i = 0; i < antrenmanTuru.length; i++) {
            System.out.println("antrenman türünü giriniz: koşu / ağırlık / yüzme / dinlenme");
            antrenmanTuru[i] = scanner.nextLine().trim().toLowerCase();

        }
        double [] dk = new double [7];

        for (int i = 0; i < dk.length; i++) {
            System.out.println((i+1) + ". gün kaç dakika çalıştın: ");
            dk[i] = scanner.nextDouble();
        }
        double yakilanKalori = 0;
        double toplamKalori = 0;
        double enYuksekKalori = 0;
        int enYuksekGun = 0;
        int dinlenmeSayisi = 0;

        for (int i = 0; i < antrenmanTuru.length; i++) {
            if (antrenmanTuru[i].equals("koşu")) {
                yakilanKalori = dk[i] * 30;
            } else if (antrenmanTuru[i].equals("ağirlik")) {
                yakilanKalori = dk[i] * 20;
            } else if (antrenmanTuru[i].equals("yüzme")) {
                yakilanKalori = dk[i] * 40;
            } else if (antrenmanTuru[i].equals("dinlenme")) {
                yakilanKalori = 0;
                dinlenmeSayisi ++;
            }
            toplamKalori += yakilanKalori;
            if (yakilanKalori > enYuksekKalori) {
                enYuksekKalori = yakilanKalori;
                enYuksekGun = i + 1;
            }
            System.out.println((i + 1) + " .gün yakılan kalori: " + yakilanKalori);
        }
        System.out.println("Toplam kalori: " + toplamKalori);
        System.out.println("En yuksek kalori olan gun: " + enYuksekGun);
        System.out.println("Dinlenme gun sayisi: " + dinlenmeSayisi);

        scanner.nextLine();

        System.out.println("hedef metni girin: ");
        String hedef = scanner.nextLine();

        String[] kelimeler = hedef.split(" ");
        int kelimelerSayisi = kelimeler.length;
        System.out.println("metindeki kelime sayisi:  " + kelimelerSayisi);


    }
}
