package gun20;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class methodOrnekleri_1 {

    public static void main(String[] args) {
        // kullanıcıdan alınan sayının tek mi çift mi olduğunu bulan bir metod yazın.

        Scanner scanner = new Scanner(System.in);

        /**
        System.out.println("sayı girin: ");
        int sayi = scanner.nextInt();

        if (sayi % 2 == 0) {
            System.out.println("sayı çifttir");
        }else {
            System.out.println("sayı tektir");
        }
         **/

        List<Boolean> sayilarinDurumu = new ArrayList<>();

        for (int index = 1; index <= 5; index++) {
            System.out.println(index + ". sayıyı girin: ");
            int num = scanner.nextInt();
            boolean result = ciftMi(num);
            sayilarinDurumu.add(result);
        }
        for (Boolean sonuc : sayilarinDurumu) {
            if (sonuc) {
                System.out.println("sayı çifttir.");
            }else {
                System.out.println("sayı tektir.");
            }
        }
    }
    //kullanıcıdan alınan 5 sayının tek mi çift mi olduğunu bulup
    // bir listeye kaydeden bir metod yazın.

    public static boolean ciftMi(int sayi) {
        if (sayi % 2 == 0) {
            return true;
        }else {
            return false;
        }
    }
}
