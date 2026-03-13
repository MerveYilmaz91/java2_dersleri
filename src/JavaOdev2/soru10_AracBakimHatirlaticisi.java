package JavaOdev2;

import java.util.Scanner;

public class soru10_AracBakimHatirlaticisi {
    public static void main(String[] args) {
        /**
         * Araç Bakım Hatırlatıcısı:
         * Kullanıcıdan 8 farklı bakım kaleminin adını al (ör. yağ değişimi, lastik, fren, filtre...) ve bir diziye kaydet.
         * Her kalem için, son bakım tarihini "GG/AA/YYYY" biçiminde metin olarak al ve ayrı bir diziye kaydet.
         * Kullanıcıdan bakım türünü seçmesini iste: "acil", "normal", "kontrol".
         * Seçime göre uyarı mesajı üret.
         * Girilen tarih metninde "/" karakteri yoksa veya uzunluk uygunsuzsa uyarı ver.
         * Son olarak, bakım adı içinde en az 1 rakam geçen kayıt var mı kontrol et ve toplam kaç tanesinde rakam geçtiğini yazdır.
         **/

        Scanner scanner = new Scanner(System.in);

        String[]bakimAdlari = new String[8];
        String[] tarihler = new String[8];

        for (int i = 0; i < bakimAdlari.length; i++) {
            System.out.println((i+1) + ". bakım adını giriniz.");
            bakimAdlari [i] = scanner.nextLine().toLowerCase().trim();

            System.out.println((i+1) + " son bakım tarihlerini giriniz. (GG/AA/YYYY)");
            tarihler[i] = scanner.nextLine().trim();

            if (!tarihler[i].contains("/") || tarihler[i].length() != 10) {
                System.out.println("Uyarı: tarih formatı hatalı!");
            }
        }
        System.out.println("bakım türünü seçin: acil / normal / kontrol");
        String bakimTuru = scanner.nextLine().trim().toLowerCase();

        if (bakimTuru.equals("acil")) {
            System.out.println("uyarı: araç bakımını hemen yaptırın.");
        }else if (bakimTuru.equals("normal")) {
            System.out.println("bakım zamanı yaklaşıyor");
        }else if (bakimTuru.equals("kontrol")) {
            System.out.println("araç genel kontrolden geçmelidir.");
        }else {
            System.out.println("geçersiz bakım türü girdiniz.");
        }
        int rakamGecenSayisi = 0;
        boolean rakamVarmi = false;

        for (int i = 0; i < bakimAdlari.length; i++) {
            for (int j = 0; j < bakimAdlari[i].length(); j++) {
                char ch = bakimAdlari[i].charAt(j);

                if(Character.isDigit(ch)) {
                    rakamVarmi = true;
                    rakamGecenSayisi++;
                    break;
                }
            }
        }
        if(rakamVarmi) {
            System.out.println("bakım adı içinde rakam geçen kayıt var.");
        }else {
            System.out.println("bakım adı içinde rakam geçen kayıt yok");
        }
        System.out.println("rakam geçen toplam bakım adı sayısı: " + rakamGecenSayisi);

    }
}
