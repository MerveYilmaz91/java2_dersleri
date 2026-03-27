package gun15;

import java.util.ArrayList;
import java.util.Scanner;

public class notListesi {
    public static void main(String[] args) {
        /**
         * kullanıcıdan notları alın.
         * -1 girildiğinde giril bitsin.
         * sonunda: notları yazdırın.
         * ortalamayı hesaplayın.
         * en yüksek ve en düşük notları yazdırın.
         * kurallar: notlar 0-100 arasında olmalı. değilse listeye eklenmesin.
         **/

        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> notlar = new ArrayList<>();

        System.out.println("not girin. notlar 0-100 arası olmalı. bitirmek için -1 girin.");

        while (true) {
            System.out.println("not: ");
            int not = scanner.nextInt();

            if (not == -1) {
                break;
            }
            if (not < 0 || not > 100) {
                System.out.println("geçersiz not girildi. 0-100 arası not girin");
                continue;
            }
            notlar.add(not);
        }
        int toplam = 0;
        int max = notlar.get(0);
        int min = notlar.get(0);

        for (int index = 1; index < notlar.size(); index++) {
            toplam += notlar.get(index);

            if ( notlar.get(index) > max) {
                max = notlar.get(index);
            }
            if ( notlar.get(index) < min) {
                min = notlar.get(index);
            }
        }
        double ortalama = (double) toplam / notlar.size();
        // toplam ve notlar integer olduğu için toplamın başına (double) yazdık.

        System.out.println("---notlar---");
        for (int index = 0; index < notlar.size(); index++) {
            System.out.println((index + 1) + ".not " + notlar.get(index));
        }
        System.out.println("ortalama: " + ortalama);
        System.out.println("en buyuk: " + max);
        System.out.println("en kucuk: " + min);

    }
}
