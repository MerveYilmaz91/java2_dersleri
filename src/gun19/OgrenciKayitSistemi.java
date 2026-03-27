package gun19;

import java.util.*;

public class OgrenciKayitSistemi {
    public static void main(String[] args) {

        /**
         * Her öğrenci bir kulübe kayıt oluyor.
         * Kullanıcıdan 7 öğrencinin adını ve kayıt olduğu kulübü al.
         * İstenenler:
         * Öğrenci adlarını ve kulüp isimlerini düzenli hale getir.
         * Aynı kulübe kayıt olan öğrencileri birlikte göster.
         * Her kulüpte kaç öğrenci olduğunu yazdır.
         * Birden fazla öğrencisi olan kulüpleri ayrı göster.
         * İsmi "m" harfi ile başlayan öğrencileri bul.
         * Hiç tekrar etmeyen kulüp isimlerini ayrı olarak ekrana yazdır.
         **/

        Scanner scanner = new Scanner(System.in);

        //futbol klubu -> ayse ahmet mehmet
        Map<String, List <String>> klupOgrencileri = new HashMap<>();

        //farkli klup isimlerini bir yerde tutacağız.
        Set<String> klupSeti = new HashSet<>();

        //ismi M harfi ile başlayan öğrenciler
        List<String> mIleBaslayanlar = new ArrayList<>();

        // 7 öğrenci
        for (int index = 1; index <= 7; index++) {
            System.out.println("ogrenci adı: ");
            String ogrenci = scanner.nextLine().trim().toLowerCase();

            System.out.println("klup adı: ");
            String klup = scanner.nextLine().trim().toLowerCase();

            klupSeti.add(klup);

            if (ogrenci.startsWith("m")) {   //m harfi ile başlayanlar
                mIleBaslayanlar.add(ogrenci);
            }
            //Eğer bu klupten map içerisin de yoksa önce o klubu map e eklemem lazım.
            // ama değer(value) kısmı için direkt olarak öğrenci ismini eklemedik, çünkü value bir list.
            // eklemeyi aşağıda yaptık

            if (!klupOgrencileri.containsKey(klup)) {
                klupOgrencileri.put(klup, new ArrayList<>());
            }

            // artık klup map içerisinde oluştu. value ataması yapabiliriz.
            // klupOgrencileri.get(klup) bu value kısmını ifade eder.
            //value lar List<String> dir. o yüzden add() ile value ya atama yapabiliriz.

            klupOgrencileri.get(klup).add(ogrenci);
        }
        System.out.println("---kluplere göre öğrenci isimleri---");
        for (Map.Entry<String, List<String>> entry: klupOgrencileri.entrySet()) {
        System.out.println(entry.getKey() + " - " + entry.getValue());
    }
        System.out.println("--- her klupteki öğrenci sayısı---");
        for (Map.Entry<String, List<String>> entry: klupOgrencileri.entrySet()) {
        System.out.println(entry.getKey() + " - " + entry.getValue().size());
        }
        System.out.println("--- M harfi ile başlayanlar ---");
        for (String name: mIleBaslayanlar) {
            System.out.println(name);
        }

        System.out.println("--- farklı klup isimleri ---");
        System.out.println(klupSeti);

    }
}
