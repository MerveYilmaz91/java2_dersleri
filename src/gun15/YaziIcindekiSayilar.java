package gun15;

import java.util.ArrayList;
import java.util.Scanner;

public class YaziIcindekiSayilar {
    public static void main(String[] args) {
        /** kullanıcıdan bir yazı girmesini isteyin.
         * bu yazı içerisinde kaç tane sayısal değer olduğunu bulun.
         * son olarak bu sayısal değerleri ekrana yazdırın.
         **/

        Scanner scanner = new Scanner(System.in);
        System.out.println("bir yazı girin. yazı içerisinde sayısal ifade olabilir.");

        String text = scanner.nextLine().trim();

        int toplam = 0;
        ArrayList<Integer> sayilar = new ArrayList<>();

        // örnek text -> Password123
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch >= '0' && ch <= '9') {
                toplam ++;
                int sayi = (int) ch - '0';  // char olarak gelen rakamı integer a çevirdik
                sayilar.add(sayi);
            }
        }
        System.out.println("bu yazı içerisinde toplam " + toplam + " sayısal ifade vardır.");
        System.out.println(sayilar);
    }
}
