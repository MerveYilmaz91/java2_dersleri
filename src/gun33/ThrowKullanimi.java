package gun33;

import java.util.Scanner;

public class ThrowKullanimi {
    public static void main (String[] args) {

        /**
         * throw kullanımındaki amaç programcının kendi kodunu kontrol altına almasını sağlamaktır.
         * hatalı olan verilerle işlem yapmaya devam etmemek için hata fırlatılır.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("yas: ");
        int yas = scanner.nextInt();

        if (yas<0) {
            throw new IllegalArgumentException("yas 0 dan küçük olamaz.");
        }
        System.out.println("yaş: " + yas);


    }
}
