package gun7;

import java.util.Scanner;

public class Restorant {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int kisi;
        do {
            System.out.print("kisi sayisi girin: ");
            kisi = scanner.nextInt();
            if (kisi < 1 || kisi > 10)
                System.out.println("Hatali kisi sayisi girdiniz. Aralik 1-10 arasinda olmali");
            }
            while (kisi < 1 || kisi > 10) ;

            if (kisi >= 7) {
                System.out.println("Buyuk masa");
            } else {
                System.out.println("Normal masa");


            }
        }
    }
