package gun17;

import java.util.HashMap;
import java.util.Map;

public class MapUzerindeGezmek {
    public static void main(String[] args) {
        HashMap<Integer, String> ogrenciler = new HashMap<>();

        ogrenciler.put(1, "serhat");
        ogrenciler.put(2, "kader");
        ogrenciler.put(3, "hüseyin");
        ogrenciler.put(4, "gökay");
        ogrenciler.put(5, "merve");

        //1. keyler ile sadece keyleri alır.
        for (Integer key : ogrenciler.keySet()) {
            System.out.println(key);
        }

        //2. value ile sadece value ları getirir
        for (String value : ogrenciler.values()) {
            System.out.println(value);
        }
        System.out.println("----------");

        //3. hem key hemde value ların geldiği durum
        //   Map.Entry<key,value>  degiskenIsmi : tanımlanan map.entrySet()
        for (Map.Entry<Integer, String> entry : ogrenciler.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

    }
}
