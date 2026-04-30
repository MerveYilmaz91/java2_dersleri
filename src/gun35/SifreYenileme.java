package gun35;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SifreYenileme {
    public static void main (String[] args) {
        /**
         * proje 5 - task 2
         **/

        Scanner scanner = new Scanner(System.in);

        // ana veri yapımız
        //dış map: hesap adı
        //iç map: kullanıcı adı, şifre bilgileri

        Map<String, Map<String, String>> sifreKayitlari = new HashMap<>();

        Map<String, String> gmailBilgisi = new HashMap<>();
        gmailBilgisi.put("kullanıcıAdi", "mehmet123");
        gmailBilgisi.put("şifre", "12345");

        sifreKayitlari.put("gmail", gmailBilgisi);

        menu();
        int secim = scanner.nextInt();
        scanner.nextLine();



        switch (secim) {
            case 1:
                System.out.println("hesap adı girin: ");
                String hesapAdi = scanner.nextLine().toLowerCase();

                System.out.println("kullanıcı adı girin: ");
                String kullaniciAdi = scanner.nextLine().toLowerCase();

                System.out.println("şifre girin");
                String sifre = scanner.nextLine();

                Map<String, String> hesapBilgileri = new HashMap<>();
                hesapBilgileri.put("kullanıcı adı: ", kullaniciAdi);
                hesapBilgileri.put("şifre: ", sifre);

                sifreKayitlari.put(hesapAdi, hesapBilgileri);

                System.out.println("şifre kaydı başarı ile oluşturuldu");
                System.out.println("program sonlandırılıyor");

                break;

            case 2:
                System.out.println("gösterilecek hesap adını girin: ");
                String arananHesap = scanner.nextLine().toLowerCase();

                if (sifreKayitlari.containsKey(arananHesap)) {
                    Map<String, String> bulunanKayit = sifreKayitlari.get(arananHesap);

                    System.out.println("kayıt bulundu");
                    System.out.println("kullanıcı adı: " + bulunanKayit.get("kullanıcı adı"));
                    System.out.println("şifre: " + bulunanKayit.get("şifre"));

                } else {
                    System.out.println("bu hesap adına ait kayıt bulunamadı");
                }
                System.out.println("program sonlandırılıyor");
                break;
            case 3:
                System.out.println("program kapatıldı");
                break;
            default:
                System.out.println("geçersiz seçim yaptınız.program sonlandırılıyor");

        }
        scanner.close();

        }

    public static void menu() {
        System.out.println("menu");
        System.out.println("1- şifre ekle");
        System.out.println("2- şifre göster");
        System.out.println("3- çıkış");
        System.out.println("seçiminizi yapın: ");
    }



}
