package JavaOdev2;

import java.util.Scanner;

public class soru2_OtobusKarti {
    public static void main(String[] args) {
        /**
         * Otobüs Kartı Bakiye Kontrolü:
         * Kullanıcıdan 7 günlük yolculuk sayısını tek tek al ve bir diziye kaydet.
         * Kullanıcıdan kart türünü al: "öğrenci", "tam", "indirimli".
         * Kart türüne göre bir biniş ücretini belirle.
         * Toplam harcama hesapla ve kullanıcıdan mevcut bakiyeyi al.
         * Bakiye yeterliyse kalan bakiyeyi, değilse ne kadar eksik kaldığını yazdır.
         * Ek olarak, gün isimlerini (Pzt-Sal-...) kullanarak en çok yolculuk yapılan günü ekrana yazdır.
         **/

        Scanner scanner = new Scanner(System.in);

        int [] yolculukSayisi = new int[7];
        String [] gunler = {"pazartesi", "salı", "çarşamba", "persembe", "cuma", "cumartesi", "pazar"};

        for (int i = 0; i < 7; i++){
            System.out.println(gunler[i] + " günü kaç yolculuk yapıldı?");
            yolculukSayisi[i] = scanner.nextInt();
        }

        System.out.println("kart türünü giriniz: tam / öğrenci / indirimli");

        String kartTuru = scanner.next();

        int ucret = 0;
        if (kartTuru.equalsIgnoreCase("tam")){
            ucret = 60;
        } else if (kartTuru.equalsIgnoreCase("ogrenci")){
            ucret = 30;
        } else if (kartTuru.equalsIgnoreCase("indirimli")){
            ucret = 40;
        } else {
            System.out.println("geçersiz kart turu.");
        }

        int toplamHarcama = 0;
        for (int i = 0; i < 7; i++){
            toplamHarcama += yolculukSayisi[i] * ucret;
        }
        System.out.println("toplam harcama: " + toplamHarcama);

        System.out.println("mevcut bakiyenizi giriniz: ");
        int bakiye = scanner.nextInt();

        if (bakiye >= toplamHarcama){
            System.out.println("kalan bakiye: " + (bakiye - toplamHarcama));
        }  else {
            System.out.println("yetersiz bakiye.eksik miktar: " + (toplamHarcama - bakiye));
        }
        int max = yolculukSayisi[0];
        int index = 0;
        for (int i = 1; i < 7; i++){
            if (yolculukSayisi[i] > max){
                max = yolculukSayisi[i];
                index = i;
            }
        }
        System.out.println("en çok yolculuk yapılan gün: " + gunler[index]);
    }
}
