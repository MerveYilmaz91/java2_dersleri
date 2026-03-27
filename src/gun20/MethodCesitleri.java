package gun20;

import java.util.Scanner;

public class MethodCesitleri {
    public static void main(String[] args) {

        /**
         * 1- değer döndürmeyen parametresiz method
         * 2- değer döndürmeyen parametreli method
         * 3- deger döndüren parametresiz method
         * 4- deger döndüren parametreli method.
         **/

        selamVer();
        merhabaYaz("merve");

        //deger dönüyor demek, dönen değer tipinde bir değişkene atama yapmaktır.

        int toplamSonucu= toplam();
        //değer döndüren ve parametre alan method.
        int carpmaSonucu=carpma(5,6);

        System.out.println("Toplama sonucu: " + toplamSonucu);
        System.out.println("Carpma sonucu: " + carpmaSonucu);



    }
    // 1- değer döndürmeyen parametresiz method

    public static void selamVer() {
        System.out.println("method konusuna hoş geldiniz");
    }

    // 2- değer döndürmeyen parametreli method

    public static void merhabaYaz(String name) {
        System.out.println("hoşgeldin " + name);
    }

    // 3- deger döndüren parametresiz method

    public static int toplam() {
        return 3+4;
    }

    // 4- deger döndüren parametreli method

    public  static int carpma(int sayi1, int sayi2) {
        return sayi1 * sayi2;
    }

    public static void menu() {
        System.out.println("---menu---");
        System.out.println("1-kola");
        System.out.println("2-cay");
        System.out.println("3-kahve");
        System.out.println("4-portakal suyu");
        System.out.println("5-salep");
    }


}
