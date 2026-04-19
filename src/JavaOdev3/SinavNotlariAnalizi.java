package JavaOdev3;

import java.util.*;

public class SinavNotlariAnalizi {
    public static void main(String[] args) {
        /**
         * Bir öğrencinin sınav notları giriliyor. Bazı notlar aynı olabilir.
         * Tüm notları saklayınız.
         * Farklı notları ayrı olarak gösteriniz.
         * Her notun kaç kez girildiğini bulunuz.
         * En çok tekrar eden notu ekrana yazdırınız.
         **/

        Scanner scanner = new Scanner(System.in);
        System.out.println("bir öğrencinin sınav notlarını girin: ");

        ArrayList<Integer> sinavNotlari = new ArrayList<>();

        for (int index = 1; index <= 3; index++) {
            System.out.println(index + ". not: ");
            int notlar = scanner.nextInt();
            sinavNotlari.add(notlar);
        }
        Set<Integer> farkliNotlar = new HashSet<>(sinavNotlari);
        System.out.println("farklı notlar: " +  farkliNotlar);

        Map<Integer, Integer> sayac = new HashMap<>();
        for (int notlar : sinavNotlari) {
            if (sayac.containsKey(notlar)) {
                sayac.put(notlar, sayac.get(notlar) + 1);
            } else {
                sayac.put(notlar, 1);
        }
    }
        for (Map.Entry<Integer, Integer> entry : sayac.entrySet()) {
        System.out.println(entry.getKey() + " -> " + entry.getValue() + ". kez girildi");

        }
        int maxNot = 0;
        int maxSayac = 0;

        for (Map.Entry<Integer, Integer> entry : sayac.entrySet()) {
            if (entry.getValue() > maxSayac) {
                maxSayac = entry.getValue();
                maxNot = entry.getKey();
            }
        }
        System.out.println("en çok tekrar eden not: " + maxNot);
    }
}
