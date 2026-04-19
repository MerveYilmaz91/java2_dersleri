package gun33.ornek1;

import gun21.SinavOrtalamasi;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ATM {

    public static void main (String[] args) {
        /**
         * Bir ATM uygulamasında kullanıcıdan çekmek istediği para miktarı alınacaktır.
         * Kullanıcı sayı yerine metin girerse hata mesajı verilsin.
         * Eğer sayı doğru girilirse ekrana çekilmek istenen tutar yazdırılsın.
         **/

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("çekmek istediğiniz tutarı girin: ");
            int tutar = scanner.nextInt();

            if (tutar<0) {
                throw new RuntimeException("negatif tutar çekilemez");
            }

            System.out.println("çekmek istediğiniz tutarı girin: " + tutar + "TL dir");
        } catch (InputMismatchException exception) {
            System.out.println("hatalı giriş yaptınız, lütfen sayı girin.");
        }catch (IllegalArgumentException ex) {
            System.out.println("negatif tutar çekilir mi akıllı");
        }

    }
}
