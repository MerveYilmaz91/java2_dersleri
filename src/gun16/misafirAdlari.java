package gun16;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class misafirAdlari {
    public static void main(String[] args) {

        /**
         * kullanıcıdan 6 tane misafir ismi alacağız
         * aynı isimden birden fazla giriş yapılırsa kayıt edilmeyecek.
         * en son misafir isimlerini yazdırın.
         * toplam kaç misafir olduğunu yazdırın.
         **/

        Scanner sc = new Scanner(System.in);

        Set<String> isimler = new HashSet<>();
        // soruda özellikle belirtilmezse Hashset kullanılır.

        for (int index = 0; index < 6; index++) {
            System.out.println((index + 1) + ". misafir ismi: ");
            String isim = sc.nextLine().trim();
            isimler.add(isim);
        }
        System.out.println("---misafir isimleri---");
        for (String name : isimler) {
            System.out.println(name);

        }

        System.out.println("toplam misafir sayısı: " + isimler.size());






    }
}
