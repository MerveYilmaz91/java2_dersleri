package _07_03_2026_Practice;

import java.util.Scanner;

public class soru6 {
    public static void main(String[] args) {
        /** kullanıcıdan bir harf alın ve bu harfin alfabeye göre sesli mi yoksa sessiz mi olduğunu belirleyin.
         * geçersiz harfler kontrol edilmelidir.
         **/

        Scanner scanner = new Scanner(System.in);
        System.out.println("harf giriniz: ");

        String harf = scanner.nextLine().toLowerCase();

        switch (harf) {
            case "a" : System.out.println("sesli harf"); break;
            case "e" : System.out.println("sesli harf"); break;
            case "ı" : System.out.println("sesli harf"); break;
            case "i" : System.out.println("sesli harf"); break;
            case "o" : System.out.println("sesli harf"); break;
            case "ö" : System.out.println("sesli harf"); break;
            case "u" : System.out.println("sesli harf"); break;
            case "ü" : System.out.println("sesli harf"); break;
            default: System.out.println("sessiz harf");
        }

    }
}
