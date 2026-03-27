package gun16;

import java.util.*;

public class FarkliKelimeler {
    public static void main(String[] args) {
        /**
         * kullanıcıdan bir cümle alın.
         * bu cümleyi kelimelerine ayırın
         * kelimeleri kaydedin ama tekrar eden kelimeleri kaydetmeyin
         * tüm benzersiz kelimeleri yazdırın.
         * kaç tane farklı kelime olduğunu bulun.
         **/

        Scanner scanner = new Scanner(System.in);
        System.out.println("bir cümle girin");
        String cumle = scanner.nextLine().trim();

        //split bir string metodudur, parantez içine verdiğim ifadeye göre string içinde bölmeler yapar.
        //parantez içerisine verdiğim ifadeye göre:
        //string içinde bölmeler yapar.
        //" " -> harf harf böler.
        //"." -> noktalara göre cümleyi böler.
        String [] kelimeler = cumle.split(" ");

        //tekrar etmeyen kelimeleri tutacak set:

        Set<String> farkliKelimeler = new HashSet<>();
        for (String kelime :  kelimeler) {
            farkliKelimeler.add(kelime);
        }
        System.out.println("----farklı kelimeler----");
        System.out.println(farkliKelimeler);
        System.out.println("toplam farklı kelime sayısı: " + farkliKelimeler.size());








    }
}
