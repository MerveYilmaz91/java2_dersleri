package gun17;

import java.util.HashMap;
import java.util.Scanner;

public class NotSorgulama {
    public static void main(String[] args) {
        /**
         * bir öğretmenin elinde öğrencilerin notları ve isimleri var.
         * 4 öğrenci ve notu map içine ekleyeceğiz.
         * kullanıcıdan öğrenci adını alacağız.
         * öğrenci varsa notunu göster, yoksa öğrenci sistemde yok yazdır.
         **/

        Scanner scanner = new Scanner(System.in);

        HashMap<String, Integer> ogrenciler = new HashMap<>();
        ogrenciler.put("merve", 95);
        ogrenciler.put("asya", 99);
        ogrenciler.put("serdar", 94);
        ogrenciler.put("arzu", 91);
        ogrenciler.put("mehmet", 92);

        System.out.println("aramak istediğiniz öğrencinin adı: ");
        String name = scanner.nextLine().trim();

        if (ogrenciler.containsKey(name)) {
            System.out.println("öğrenci notu: " + ogrenciler.get(name));
        }else {
            System.out.println("aranan öğrenci sistemde yoktur.");
        }


    }
}
