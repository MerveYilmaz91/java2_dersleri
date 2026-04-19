package JavaOdev3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SiniftakiIsimleriDüzenleme {
    public static void main(String[] args) {

        /**
         * Bir sınıftaki öğrencilerin isimleri sırayla giriliyor. Aynı isim birden fazla kez yazılmış olabilir.
         * Tüm isimleri saklayınız.
         * Tekrar eden isimleri yalnızca bir kez gösteriniz.
         * Kaç farklı öğrenci olduğunu ekrana yazdırınız.
         **/

        Scanner scanner = new Scanner(System.in);
        System.out.println("öğrenci isimlerini giriniz: ");

        ArrayList<String> ogrenciIsimleri =  new ArrayList<>();

        for (int index = 1; index <=4; index++) {
            System.out.println(index + ". isim");
            String isim = scanner.nextLine().toLowerCase().trim();
            ogrenciIsimleri.add(isim);
        }

        Set<String> benzersizİsimler = new HashSet<>(ogrenciIsimleri);

        System.out.println("tüm isimler: " + ogrenciIsimleri);
        System.out.println("benzersiz isimler: " + benzersizİsimler);
    }
}
