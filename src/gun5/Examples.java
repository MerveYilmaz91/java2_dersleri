package gun5;

import java.util.Scanner;

public class Examples {
    public static void main(String[] args) {
        System.out.println("------soru1-----");
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine().trim();
        String formatName =
                name.substring(0, 1).toUpperCase() +
                        name.substring(1).toLowerCase();

        System.out.println(formatName);

        System.out.println("------soru2-----");
        String password = scanner.nextLine();
        if (password.length() < 8) {
            System.out.println("zayif");
        } else {
            System.out.println("guclu");
        }


        System.out.println("------soru3-----");
        String mail = scanner.nextLine();
        if (mail.contains("@")) {
            System.out.println("OK");
        } else {
            System.out.println("Gecersiz mail");
        }

        System.out.println("------soru4-----");
        String isim = scanner.nextLine().trim();
        int age = scanner.nextInt();
        scanner.nextLine();

        if (age >=18 && !isim.isEmpty()) {
            System.out.println("Kayit OK");
        } else {
            System.out.println("Kayit not OK");
        }

        System.out.println("------soru5-----");
        String kelime = scanner.nextLine().trim();
        if (kelime.length() >= 1 &&
                kelime.charAt(0) == kelime.charAt(kelime.length() - 1)) {
            System.out.println("ayni");
        } else {
            System.out.println("ayne degil");
        }


        System.out.println("------soru6-----");
        String s = scanner.nextLine();

        int index = s.indexOf('a');
        if (index == -1) {
            System.out.println("yok");
        } else {
            System.out.println(index);
        }






    }
}
