package gun12;

import java.util.Scanner;

public class OtobusKartBakiyesi {
    public static void main(String[] args) {
        /** kullanıcıdan kaç yolculuk yapacağını alın.
         * her yolculuk için "tam/öğrenci/indirimli" tipini sorun.
         * her yolculukta ücret düşülsün.
         * en sonda:
         * toplam kullanılan ücret
         * kalan bakiye
         * en çok kullanılan kart tipi hangisi (tam/öğrenci/indirimli) yazdırın.
         * kart tipi yanlış girilirse o yolculuğu saymayın.
         **/

        Scanner scanner = new Scanner(System.in);
        System.out.println("başlangıç bakiyesi girin: ");
        double bakiye = scanner.nextDouble();

        System.out.println("kaç yolculuk yapacaksınız: ");
        int yolculukSayisi = scanner.nextInt();

        //int tam = 0 , ogrenci=0, indirimli=0;  bu şekildede tanımlama yapabiliriz.
        int tam = 0;
        int ogrenci = 0;
        int indirimli = 0;

        double toplamHarcamaMiktari = 0;


        scanner.nextLine(); // buffer temizleme


        for(int i = 0; i < yolculukSayisi; i++){
            System.out.println("yolculuk tipi(tam, öğrenci, indirimli)");
            String yolculukTipi = scanner.nextLine().toLowerCase().trim();
            double ucret;

            switch(yolculukTipi){
                case "tam":
                    ucret = 20;
                    tam++;
                    break;
                    case "ogrenci":
                        ucret = 15;
                        ogrenci++;
                        break;
                        case "indirimli":
                            ucret = 10;
                            indirimli++;
                            break;
                default:
                    System.out.println("hatalı yolculuk tipi yapıldı.");
                    continue;   //kart tipi yanlış girildiğinde başa dönmesi için continue kullanıyoruz burada
            }
            if (bakiye < ucret){
                System.out.println("yetersiz bakiye");
                continue;
            }
            bakiye -= ucret; //bakiyeden ücretin düşülmesi için -= yaptık.
            toplamHarcamaMiktari += ucret;

        }
        System.out.println("toplam harcanan: " + toplamHarcamaMiktari);
        System.out.println("kalan bakiye: " + bakiye);

        if (tam>=ogrenci && tam>=indirimli){
            System.out.println("en çok kullanılan tip tamdır");
        } else if (ogrenci >= tam && ogrenci >= indirimli) {
            System.out.println("en çok kullanılan tip öğrencidir");
        }else {
            System.out.println("en çok kullanılan tip indirimlidir");
        }
        scanner.close();
    }
}
