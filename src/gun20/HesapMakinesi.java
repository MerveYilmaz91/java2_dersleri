package gun20;

import java.util.Scanner;

public class HesapMakinesi {
    public static void islemlerMenusu() {
        System.out.println("---islemler---");
        System.out.println("toplama için + ");
        System.out.println("çıkarma için -");
        System.out.println("çarpma için * ");
        System.out.println("bölme için / ");

    }

    public static void sonuc(String islem,int sayi1,int sayi2) {
        switch (islem) {
            case "+":
                System.out.println("toplam: " +  (sayi1 + sayi2));
                break;
            case "-":
                System.out.println("çıkarma: " +  (sayi1 - sayi2));
                break;
            case "*":
                    System.out.println("çarpma: " +  (sayi1 * sayi2));
                    break;
            case "/":
                System.out.println("bölme: " +  (sayi1 / sayi2));
                break;
            default:
                System.out.println("geçersiz işlem");
        }

    }
    public static void main(String[] args) {

        /** kullanıcıdan 5 defa 2 şer adet sayı ve işlem alın.
         * kullanıcının seçtiği işleme göre cevapları sırası ile ekrana yazdırın.
         **/

        Scanner scanner = new Scanner(System.in);

        for (int index = 1; index <= 5; index++) {
            System.out.print("1.sayi: ");
            int sayi1 = scanner.nextInt();
            System.out.print("2.sayi: ");
            int sayi2 = scanner.nextInt();

            scanner.nextLine();

            islemlerMenusu();

            System.out.println("işlem seçin: ");
            String islem = scanner.nextLine().trim();

            sonuc(islem, sayi1,sayi2);

        }
    }
}
