package gun35;

import java.util.Scanner;

public class IsimBirleştirme {
    public static void main (String[] args) {
        /**
         * kullanıcıdan adı ve soyadı ayrı ayrı alınsın
         * bu iki bilgi stringBuilder kullanarak tek bir metinde birleştirilsin
         * çıktı şu formatta olsun:
         * Ad Soyad: Mehmet Şimsek
         **/

        Scanner scanner = new Scanner(System.in);

        System.out.println("adınızı girin: ");
        String ad = scanner.nextLine();

        System.out.println("soyadınızı girin: ");
        String soyad = scanner.nextLine();

        StringBuilder sb = new StringBuilder();

        sb.append("ad ve soyad: ");
        sb.append(ad);
        sb.append(" ");
        sb.append(soyad);
        System.out.println(sb);

        scanner.close();


    }

}
