package gun23;

import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) {
        /**
         *String isim = "Merve";
         * String soyisim = "Yilmaz";
         * int yas = 35
         * double boy = 1.60;
         * int[] sayi = {98,87,67,78};
         *
         * List,Set,Map yağılarını gördük.
         * bunlar aynı türden olan verileri tutuyorlardı. List ve set
         * Map ile key value şeklinde veri tutuyordu.
         *
         * yukarıdaki 5 değişkeni bir veri tipi altında toplayabiliyoruz.
         * bu yapıya javada class deniyor.
         *
         **/


        //ogrenci 1 diyerek bir nesne ürettik
        //javada class isimleri büyük harf ile baslar.

        Ogrenci ogrenci1 = new Ogrenci();
        ogrenci1.isim = "merve";
        ogrenci1.soyisim="yilmaz";
        ogrenci1.yas = 35;
        ogrenci1.boy = 1.60;
        ogrenci1.notlar = new int[] {98,65,85,99};

        Araba araba = new Araba();
        araba.marka="Mercedes Benz";
        araba.model = "G63";
        araba.motor = 3.0;
        araba.renk= "siyah";
        araba.hiz= 200;
        araba.manuelMi = false;

        araba.bilgileriniYazdir();

        araba.hizlan();
        araba.hizlan();

        araba.bilgileriniYazdir();
        araba.yavasla();

        araba.bilgileriniYazdir();


    }
}
