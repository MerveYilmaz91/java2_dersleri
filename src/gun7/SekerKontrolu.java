package gun7;

import java.util.Scanner;

public class SekerKontrolu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int seker;
        do {
            System.out.println("Seker miktari girin (0-5) arası: ");
            seker = scanner.nextInt();
            if (seker < 0 || seker > 5) {
                System.out.println("Hatali secim. 0-5 arasında secim yapmalısın.");
            }
        } while (seker < 0 || seker > 5);

        System.out.println("secilen seker miktarı: " + seker);





    }
}
