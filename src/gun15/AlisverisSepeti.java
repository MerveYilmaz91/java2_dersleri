package gun15;

import java.util.ArrayList;
import java.util.Scanner;

public class AlisverisSepeti {
    public static void main(String[] args) {
        /**
         * Kullanıcı ürün isimlerini tek tek girecek
         * kullanıcı bitti yazana kadar devam edecek.
         * en son :
         * sepetteki ürünleri sıra numarası ile yazdırıcaz.
         * kullanıcının girdiği ürünün adını aratıcaz.
         * varsa kaçıncı sırada olduğunu yazdırın.
         * yoksa bulunamadı yazdırın.
         **/

        Scanner scanner = new Scanner(System.in);

        ArrayList <String> isimler = new ArrayList();

        do {
        System.out.println("ürün ismi: ");
        String isim = scanner.nextLine().trim();
        } while (false);
    }
}
