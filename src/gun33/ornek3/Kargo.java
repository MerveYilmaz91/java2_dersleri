package gun33.ornek3;

import java.util.Scanner;

public class Kargo {
    public static void main(String[] args) {
        /**
         * Bir kargo firmasında toplam ürün sayısı,
         * koli sayısına bölünerek koli başına düşen ürün miktarı hesaplanacaktır.
         * Koli sayısı 0 girilirse hata mesajı verilsin.
         **/

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("toplam ürün sayısı: ");
            int toplam = scanner.nextInt();

            System.out.println("koli sayısı: ");
            int koliSayisi = scanner.nextInt();

            int sonuc = toplam / koliSayisi;

            System.out.println("her kolide ortalama " + sonuc + "ürün vardır");
        }catch (ArithmeticException arithmeticException) {
            System.out.println("hata: koli sayısı 0 olamaz.");
        }


    }
}
