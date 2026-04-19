package JavaOdev3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SehirListesiKontrolu {
    public static void main(String[] args) {
        /**
         * Kullanıcıdan 6 tane şehir adı alınız.
         * Girilen şehirleri saklayınız.
         * Aynı şehir birden fazla girildiyse bunu tekilleştiriniz.
         * Şehirleri ekrana yazdırınız.
         * "Ankara" adlı bir şehir listede var mı kontrol ediniz.
         **/

        Scanner scanner = new Scanner(System.in);
        System.out.println("6 tane şehir adı giriniz: ");

        ArrayList<String> sehirler = new ArrayList<>();

        for (int index = 1; index <= 6; index++) {
            System.out.println(index + ". şehir: ");
            String sehir = scanner.nextLine().toLowerCase().trim();
            sehirler.add(sehir);
        }

        Set<String> benzersizSehirler = new HashSet<>(sehirler);

        System.out.println("şehirler: " +  benzersizSehirler);

        if (benzersizSehirler.contains("ankara")) {
            System.out.println("Ankara listede var");
        }else {
            System.out.println("Ankara listede yok");
        }
    }
}
