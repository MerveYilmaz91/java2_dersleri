package gun4;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        String a = "Mehmet";
        int age = 32;
        double motor = 2.4;

        Scanner scanner = new Scanner(System.in);

        System.out.println("ogrencinin ismini girin");
        String name = scanner.nextLine();

        System.out.println("ogrencinin yasini girin");
        int age2 = scanner.nextInt();

        System.out.println("ogrencinin ismi " + name + "ogrencinin yasi " + age);


        System.out.print("1. sayi: ");
        int sayi1 = scanner.nextInt();
        System.out.print("2. sayi: ");
        int sayi2 = scanner.nextInt();

        System.out.println("Toplam: " + (sayi1 + sayi2));










    }
}
