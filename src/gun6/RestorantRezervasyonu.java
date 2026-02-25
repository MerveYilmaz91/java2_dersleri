package gun6;

import java.util.Scanner;

public class RestorantRezervasyonu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("isim soyisim bilgisini girin");
        String fullname = scan.nextLine().trim();

        System.out.println("kisi sayisi?");
        int kisiSayisi = scan.nextInt();
        scan.nextLine();

        System.out.println("Bolum tercihi (sigara / sigarasiz / vip)");
        String bolum = scan.nextLine().trim().toLowerCase();

        if (!fullname.contains(" ")) {
            System.out.println("isim soyisim bilgisi eksik");

        }

        switch(bolum) {
            case "sigara":
                System.out.println("sigarali bolum secildi");
                break;
                case "sigarasiz":
                    System.out.println("sigarasiz bolum secildi");
                    break;
                    case "vip":
                        System.out.println("vip bolum secildi");
                        break;
                        default:
                            System.out.println("gecersiz bolum secildi");

        }

        if (kisiSayisi > 6) {
            System.out.println("buyuk masa gerekli");
        } else if (kisiSayisi <= 0) {
            System.out.println("rezervasyon icin kisi sayisi en az 1 olmalidir");
        }

        System.out.println("Rezervasyon yapan kisi: " + fullname + "toplam kisi sayisi: " + kisiSayisi);

    }
}
