package _28_02_2026_Practice;

import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {

        /** kullanıcıdan yaşını girmesini isteyin
         * eger yaşı 18 veya daha büyükse "ehliyet alabilirsiniz" mesajı verin.
         * daha küçükse "ehliyet alamazsınız. mesajı verin
         **/

        Scanner readInt = new Scanner(System.in);
        System.out.println("Lutfen yasinizi girin: ");
        int girilenYas = readInt.nextInt();

        String mesaj;

        if(girilenYas < 18) {
            mesaj = "Ehliyet alamazsiniz" ;
        } else {
            mesaj = "Ehliyet alabilirsiniz" ;
        }
        System.out.println(mesaj);




    }
}
