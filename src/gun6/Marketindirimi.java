package gun6;

import java.util.Scanner;

public class Marketindirimi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("urun adı: ");
        String product = scanner.nextLine().trim();

        System.out.println("urun adedi: ");
        int miktar = scanner.nextInt ();
        scanner.nextLine();  // buffer temizleme

        System.out.println("kupon kodu(SAVE10, SAVE20, NONE): ");
        String kupon = scanner.nextLine().trim().toUpperCase();

        double urunFiyati = 20.0;
                double total = urunFiyati * miktar;

        switch(kupon) {
            case "SAVE10":
                total *= 0.9;
                break;
                case "SAVE20":
                    total *= 0.7;
                    break;
                    case "NONE":
                        break;
                        default:
                            System.out.println("gecersiz kupon girildi");
        }

        if (miktar > 5) {
            total *= 0.95;

        }

        if (product.toLowerCase().contains("sut")) {
            System.out.println("Urun icerisinde laktoz vardir");

        }

        System.out.println("urun:" + product + "miktar:" + miktar);
        System.out.println("kupon:" + kupon + "total:" + total);






    }
}
