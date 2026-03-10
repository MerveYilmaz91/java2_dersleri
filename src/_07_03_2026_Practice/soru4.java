package _07_03_2026_Practice;

import java.util.Scanner;

public class soru4 {
    public static void main(String[] args) {
        /**
         * kullanıcıdan bir ayın numarasını (1-12) alın
         * ve bu numaraya karşılık gelen ayın adını yazdıran bir program yazın
         * geçersiz bir ay numarası girdiğinde  "geçersiz ay numarası" yazın.
         **/

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen ay numarası giriniz:");
        int ay = scanner.nextInt();

        if (ay == 1) {
        System.out.println("ocak");
    } else if (ay == 2) {
            System.out.println("şubat");

        }else if (ay == 3) {
            System.out.println("mart");
        } else if (ay == 4) {
            System.out.println("nisan");
        }else if (ay == 5) {
            System.out.println("mayıs");
        }else if (ay == 6) {
            System.out.println("haziran");
        } else if (ay == 7) {
            System.out.println("temmuz");
        } else if (ay == 8) {
            System.out.println("ağustos");
        }  else if (ay == 9) {
            System.out.println("eylül");
        } else if (ay == 10) {
            System.out.println("ekim");
        } else if (ay == 11) {
            System.out.println("kasım");
        }else if (ay == 12) {
            System.out.println("aralık");
        }else if (ay >= 13) {
            System.out.println("GEÇERSİZ NUMARA GİRDİNİZ");
        }
    }
}
