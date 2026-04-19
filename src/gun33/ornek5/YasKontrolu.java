package gun33.ornek5;

import java.util.Scanner;

public class YasKontrolu {
    public static void main (String[] args) {

        /**
         * Bir etkinlik kaydında kullanıcı yaşı negatif girilmemelidir.
         * Eğer kullanıcı negatif yaş girerse program kendi hatasını oluştursun
         * ve uygun mesaj versin.
         **/

        Scanner scanner = new Scanner(System.in) ;

        try {
            System.out.println("yasınızı girin: ");
            int yas = scanner.nextInt();

            if (yas < 0) {
                throw new IllegalArgumentException("yaş 0 dan küçük olamaz");
            }

            System.out.println("girilen yaş: " + yas);
        }catch (IllegalArgumentException e) {
            System.out.println("hata: " + e.getMessage());
        }


    }
}
