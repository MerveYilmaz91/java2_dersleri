package gun24.soru1;

import gun21.SinavOrtalamasi;

public class mainClass {
    public static void main(String[] args) {
        /**
         * bir araba sınıfı oluşturun.
         * her araba için ortak olan değişken üretim yeri adedidir.
         * bu arabadan 2 tane üretip çıktılara bakalım.
         **/

        Araba araba1 = new Araba();
        araba1.marka = "Mercedes";
        araba1.model = "G63";
        araba1.motorHacmi= 3.0;

        Araba araba2 = new Araba();
        araba2.marka = "BMW";
        araba2.model = "M5";
        araba2.motorHacmi= 2.4;

        System.out.println("Araba 1 marka : "+araba1.marka);
        System.out.println("Araba 2 marka : "+araba2.marka);

        System.out.println("üretim yeri: " + Araba.uretimYeri);

    }
}
