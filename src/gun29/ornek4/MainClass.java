package gun29.ornek4;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        /**
         * Bir hastanede tüm çalışanların ortak olarak
         * ad, soyad, yaş ve görev yeri bilgileri tutuluyor.
         * Çalışanlar farklı gruplara ayrılıyor:
         * Doktor için branş bilgisi
         * Hemşire için nöbet sayısı
         * Sekreter için masa numarası
         * Sistemde birkaç personel tanımlanacak.
         * Kullanıcıdan bir personelin adı alınacak ve o kişiye ait bilgiler
         * gösterilecek. Eğer isimde boşluk fazlalığı varsa düzenlenerek
         * işlem yapılacak. Ayrıca belirli bölümlerde çalışan personeller
         * ayrı şekilde listelenecek.
         **/

        Scanner scanner = new Scanner(System.in);

        Doktor doktor = new Doktor("merve","yilmaz",35,"kardiyoloji","kalp cerrahı");
        Hemsire hemsire = new Hemsire("ayse","öztürk",44,"acil",10);
        Sekreter sekreter = new Sekreter("ali","veli",33,"acil",34);

        ArrayList<Calisan> calisans = new ArrayList<>();

        calisans.add(doktor);
        calisans.add(hemsire);
        calisans.add(sekreter);

        System.out.println("çalışan adı: ");
        String aranan = scanner.nextLine().trim();

        boolean personelVarmi = false;

        for (Calisan calisan : calisans) {
            if (calisan.getAd().equalsIgnoreCase(aranan)) {
                personelVarmi=true;
                calisan.bilgiyazdir();
            }
        }

        if(!personelVarmi) {
            System.out.println("aradığınız personel bizde çalışmamaktadır.");
        }

        System.out.println("----------acilde çalışanlar--------");

        for (Calisan calisan : calisans) {
            if (calisan.getGorev().equalsIgnoreCase("acil")) {
                calisan.bilgiyazdir();
                System.out.println("-------------");
            }
        }

    }
}
