package _07_03_2026_Practice;

import java.util.Scanner;

public class SwitcCase {
    public static void main(String[] args) {
        /** bir basamaklı girilen bir sayının değerini yazı ile yazdırın.
         * mesela 1 -> bir, 2 -> iki
         **/
         Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir basamaklı sayı girin: ");
        int girilenSayi = scan.nextInt();

        switch(girilenSayi) {
            case 1: System.out.println("bir"); break;
            case 2: System.out.println("iki");  break;
            case 3: System.out.println("üç");  break;
            case 4: System.out.println("dört");  break;
            case 5: System.out.println("beş");  break;
            case 6: System.out.println("altı");   break;
            case 7: System.out.println("yedi");   break;
            case 8: System.out.println("sekiz");   break;
            case 9: System.out.println("dokuz");    break;
            case 0: System.out.println("sıfır");   break;

            default:
                System.out.println("geçersiz giriş yaptınız");

        }




    }
}
