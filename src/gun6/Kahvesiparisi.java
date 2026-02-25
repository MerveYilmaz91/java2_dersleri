package gun6;

import java.util.Scanner;

public class Kahvesiparisi {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Icecek turune olsun? (Kahve, Cay, Limonata)");
        String drink = scan.nextLine().trim();

        System.out.println("Icecek boyutu ne olsun (S, M, L,)");
        String size = scan.nextLine().trim();

        System.out.println("Kac seker olsun (0-5)");
        int sugar = scan.nextInt();

        double price = 0;

        switch (drink) {
            case "kahve":
                price = 300;
                break;
            case "cay":
                price = 30;
                break;
            case "limonata":
                price = 20;
                break;
            default:
                System.out.println("Gecersiz icecek");
        }

        if (size.equalsIgnoreCase("M")) {
            price += 5;

        } else if (size.equalsIgnoreCase("L")) {
            price += 10;

        } else if (size.equalsIgnoreCase("S")) {

            System.out.println("Gecersiz boy girisi yapildi");
        }
        if (sugar < 0 || sugar > 5) {
            System.out.println("seker sayisi 1-5 arasi olabilir");
        }
        System.out.println("icecek: " + drink + " boyutu: " + size.toUpperCase());
        System.out.println("toplam tutar: " + price);



    }

}