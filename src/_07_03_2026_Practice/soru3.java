package _07_03_2026_Practice;

import java.util.Scanner;

public class soru3 {
    public static void main(String[] args) {
        /**
         * kullanıcının girdiği ders notunu uygun şekilde yazdırınız.
         * 90 için A
         * 80 için B
         * 70 için C
         * 60 için D
         * 40 için E
         * < 40 için F
         **/

        Scanner scanner = new Scanner(System.in);
        System.out.println("ders notunu giriniz: ");
        int not = scanner.nextInt();

        if(not>=90) {
            System.out.println("ders notunuz: A");
        } else if (not>=80) {
            System.out.println("ders notunuz: B");
        } else if (not>=70) {
            System.out.println("ders notunuz: C");
        } else if (not>=60) {
            System.out.println("ders notunuz: D");
        }else if (not>=40) {
            System.out.println("ders notunuz: E");
        } else {
            System.out.println("ders notunuz: F");
        }
        
    }
}
