package gun17;

import java.util.HashMap;

public class MapKonusu {
    public static void main(String[] args) {
        /**
         * Array -> aynı veri tipinde kaç tane yapı saklayacağı başlangıçta belli olan yapı.
         * ArrayList -> aynı veri tipinde kaç tane veri saklayacağı belli olmayan bir yapı.
         * setler -> aynı veri tipinde kaç tane veri saklayacağı belli olmayan, ama tekrar eden verileri de saklamayan yapı.
         * mapler -> anaktar - deger seklinde veriler saklayan bir yapıdır.
         * -> örn: öğrenci no -> öğrenci adı gelir
         * plaka kodu -> şehir adı
         * tc -> kişi bilgileri
         * ürün adı - > ürün fiyatı
         * key (anahtar) -> value(deger)
         * "TR" -> "TÜRKİYE"
         * "EN" -> "ENGLAND"
         *
         * keyler (anahtarlar) -> benzersiz olmalı, aynı anahtara yeni değer eklersek eski değeri silip yenisini ekler.
         *
         * maplerde index mantığı yok. map.get(0) -> diye bir kullanım yok.
         *
         * Map türleri: HashMap / LinkedHashMap / TreeMap
         **/


        // soldaki string key - sağdaki string value ifade eder.
        //her seferinde string, string olmak zorunda değil.
        HashMap<String, String> ulkeler = new HashMap<>();

        //veri ekleme
        ulkeler.put("TR", "Turkiye");
        ulkeler.put("DE", "Deutschland");
        ulkeler.put("EN", "England");
        System.out.println(ulkeler);

        System.out.println("---------");
        //veri çağırmalar key ile yapılır.
        System.out.println(ulkeler.get("EN"));
        System.out.println(ulkeler.get("FR"));   //verilen key map te yoksa cevap null döner.

        //eleman silme
        ulkeler.remove("DE");
        System.out.println(ulkeler.containsKey("DE"));  //aranan eleman var mı kontrolü
        System.out.println(ulkeler.containsKey("TR"));

        //aranan eleman var mı kontrolü value üzerinden de yapılır.
        System.out.println(ulkeler.containsKey("Turkiye"));

        //map boş mu kontrolü
        System.out.println(ulkeler.isEmpty());

        //map in boyutu
        System.out.println(ulkeler.size());

        //map i tamamen silme
        ulkeler.clear();

    }
}
