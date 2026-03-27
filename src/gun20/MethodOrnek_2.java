package gun20;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MethodOrnek_2 {
    public static void main(String[] args) {
        /** kullanıcıdan ayrı ayrı 5 isim ve soyisim alın,
         * en son bu isim ve soyisimleri tek bir satırda yazdıran methodu yazın.
         **/

        Scanner scanner = new Scanner(System.in);

        List<String > tamIsimler = new ArrayList<>();

        for (int index = 1; index <= 5; index++) {
            System.out.print(index + ". isim: ");
            String isim = scanner.nextLine().trim();
            System.out.print(index + ". soyisim: ");
            String soyisim = scanner.nextLine().trim();

            String tamIsim = fullName(isim, soyisim);
            tamIsimler.add(tamIsim);
        }
        for (int index = 0; index < 5; index++) {
            System.out.println((index + 1) + " . kullanıcı isim ve soyismi: " + tamIsimler.get(index));

        }
    }

    public static String fullName(String firstname, String lastName) {
        return firstname + " " + lastName;
    }
}

