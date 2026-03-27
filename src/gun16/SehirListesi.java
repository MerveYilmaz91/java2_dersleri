package gun16;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SehirListesi {
    public static void main(String[] args) {

        /**
         * kullanıcıdan ziyaret ettiği 7 şehir ismini alın.
         * aynı şehir ismi varsa bunu kaydetmeyin
         * en sonunda şehir isimlerini gittiği sıra ile yazdırın.
         * istanbul şehrinin listede olup olmadığını kontrol edin.
         **/

        Scanner scan = new Scanner(System.in);

        Set<String> sehirler = new LinkedHashSet<>();
        for (int index = 1; index < 7; index++) {
            System.out.println(index + ". sehir ismi: ");
            String sehir = scan.nextLine().trim();

            sehirler.add(sehir);
        }
        System.out.println("---sehir isimleri---");
        for (String s : sehirler) {
            System.out.println(s);
        }
        if (sehirler.contains("istanbul")) {
            System.out.println("istanbul daha önce ziyaret edilmiştir.");
        } else {
            System.out.println("büyük kayıp");
        }
    }
}
