package _28_02_2026_Practice;

import java.util.Scanner;

public class ornek3 {
    public static void main(String[] args) {
        /** kullanıcıdan "E" veya "K" harflerini alarak
         * cinsiyetini belirleyen bir program yazın.
         * E: Erkek, K: kadın
         **/

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi girin: ");

        char cinsiyet = input.nextLine().toLowerCase().charAt(0);

        if (cinsiyet =='e'){
            System.out.println("Erkek");
        }else if (cinsiyet =='k'){
            System.out.println("Kadin");
        }else {
            System.out.println("Gecersiz giris yaptınız");
        }


    }
}
