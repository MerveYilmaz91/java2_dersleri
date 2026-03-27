package gun18;

import java.util.HashMap;
import java.util.Map;

public class MapKonuTekrari {
    public static void main(String[] args) {

        //mapler key(anahtar), value(deger) şeklinde çalışan bir yapıdır.
        //aynı key den ekleme yapılamaz, value lar ise aynı olabilir.


        //örnek - sınav sonuçları

        Map<String, Integer> notlar = new HashMap<>();

        notlar.put("ali", 55);
        notlar.put("fatma", 72);
        notlar.put("hayriye", 93);
        notlar.put("mehmet", 64);
        notlar.put("kadir", 95);
        notlar.put("tarık", 36);
        notlar.put("fatma", 77);

        System.out.println(notlar);
        // maplerde;  2 tane aynı değer yazıldığında eski değeri update eder
        // yani 2 tane fatma yazdığı için ilk değerini yazmadı. fatma : 77 yazdı

        System.out.println("---------");
        Map<Integer, String> sehirler = new HashMap<>();
        sehirler.put(1, "adana");
        sehirler.put(7, "antalya");
        sehirler.put(34, "istanbul");
        sehirler.put(35, "izmir");
        sehirler.put(41, "kocaeli");
        sehirler.put(25, "erzurum");

        System.out.println(sehirler);
    }
}
