package gun13;

import java.util.Scanner;

public class SinifTablosu {
    public static void main(String[] args) {
        /**
         * bir sınıfta 3 öğrenci var ve her öğrencinin 4 sınav notu var.
         * kullanıcıdan notları tablo şeklinde al
         * istenenler: her öğrencinin ortalamasını yazdır.
         * ortalaması 50 ve üstü olanlara "geçti", aksi halde "kaldı" yazdır.
         * sınıftaki en yüksek notu ve hangi öğrenci sınavda olduğunu yazdır.
         **/

        Scanner scanner = new Scanner(System.in);
        int ogrenciSayisi = 3;
        int notlar = 4;

        int [][] sinavNotlari = new int[ogrenciSayisi][notlar];

        int ogrIndex = -1;
        int SinavIndex = -1;
        // 0 diye başlatsaydık 0,0 indexlerini başlangıç olarak en yüksek not ve öğrenci diye kabul
        // etmiş oluruz.
        // yani 1. öğrencinin 1. notu yüksek çıkmış olurdu.
        //geçersiz bir deger olan -1 diye başlangıç değeri atadık.

        int maxNot = 0;

        for (int i = 0; i < sinavNotlari.length; i++) {
            System.out.println((i + 1) + ". öğrencinin notlari");
            for (int j = 0; j < sinavNotlari[i].length; j++) {
                System.out.println((j+1) + ". not: ");
                int not =  scanner.nextInt();
                sinavNotlari[i][j] = not;

                if (maxNot < not) {
                    maxNot = not;
                    ogrenciSayisi = i;
                    SinavIndex = j;
                }
            }

            System.out.println();
        }
        System.out.println("öğrencilerin not ortlamaları");
        for (int i = 0; i < sinavNotlari.length; i++) {
            int toplam = 0;  //iç döngü bittiğinde toplam değeri 0 lanır.
            // bu sayede her öğrenci için yeniden toplam değeri oluştururuz.

            for (int j = 0; j < sinavNotlari[i].length; j++) {
                toplam += sinavNotlari[i][j];

            }
            double ortalama = (double) toplam / sinavNotlari[i].length;

            //if -else konusundaki ternary kullanımı
            String sinavSonucu= (ortalama >= 50) ? "Geçti" : "Kaldı" ;

            System.out.printf("%d. öğrenci not ortalamasi: %.2f -> %s%n" ,(i+1),ortalama, sinavSonucu);

        }

        System.out.println("en yüksek not bilgisi: ");
        System.out.println("en yüksek not:" + maxNot);
        System.out.println("en yüksek notu alan öğrenci: " + (ogrIndex + 1) + ". öğrenci" + (SinavIndex + 1) + ".sinav");

        scanner.close();
    }
}
