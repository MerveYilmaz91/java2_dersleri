package gun7;

import java.util.Scanner;

public class SuİcmeTakibi {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int hedef = 2000;
        int toplam = 0;
        do {
            System.out.print("Kac ml su ictin: ");
            int ml = scanner.nextInt();

            if (ml > 0) {
                toplam += ml;
            } else  {
                System.out.println("0 dan buyuk bir sayi girin");
            }
            System.out.println("Toplam: " + toplam + "ml");
        } while (toplam < hedef);

        System.out.println("Tebrikler hedefe ulastiniz");







    }
}
