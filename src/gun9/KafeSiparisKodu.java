package gun9;

import java.util.Scanner;

public class KafeSiparisKodu {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String drink = "";   // başta değer veriyoruz
        String code;

        // 1) Kod uzunluğu 8 olana kadar al
        do {
            System.out.println("Kodu giriniz");
            code = scanner.nextLine().trim();

            if (code.length() != 8) {
                System.out.println("Kodun uzunlugu 8 olmalı");
            }
        } while (code.length() != 8);

        // 2) İlk harfe göre içecek türü
        char first = code.charAt(0);

        switch (first) {
            case 'k':
                drink = "kahve";
                break;
            case 'c':
                drink = "cay";
                break;
            case 'l': // sende 'L' vardı; küçük/büyük hassas
                drink = "limonata";
                break;
            default:
                drink = "gecersiz icecek";
                break;
        }

        // 3) Rakam sayısını say
        int rakamSayisi = 0;
        for (int i = 0; i < code.length(); i++) {
            char ch = code.charAt(i);
            if (ch >= '0' && ch <= '9') {
                rakamSayisi++;
            }
        }

        // 4) En az 3 rakam kontrolü
        if (rakamSayisi < 3) {
            System.out.println("Kod en az 3 rakam icermeli");
        }

        // 5) Çıktılar
        System.out.println("kodun ilk 3 karakteri: " + code.substring(0, 3));
        System.out.println("icecek turu: " + drink);

        scanner.close();
    }
}



