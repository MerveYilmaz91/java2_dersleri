package gun18;

import java.util.*;

public class marketUrunSayaci {
    public static void main(String[] args) {

        /** bir markette müşterinin aldığı ürünler sırasıyla söyle gidiyor:
         * elma, armut, elma, muz, muz,muz,armut
         * istenenler:
         * ürünleri bir liste içinde sakla.
         * her ürünün kaç kez alındığını ayrı bir yapıda tut.
         * sadece farklı ürünleri ayrı bir yapıda sakla.
         * sonuç olarak:
         * kaç farklı ürün var.
         * hangi üründen kaç tane alınmış. EKRANA YAZDIR.
         **/

        //ürünleri liste içinde sakladık.
        ArrayList<String> meyveler = new ArrayList<>();
        meyveler.add("elma");
        meyveler.add("armut");
        meyveler.add("elma");
        meyveler.add("muz");
        meyveler.add("muz");
        meyveler.add("muz");
        meyveler.add("armut");


        //sadece farklı ürünleri ayrı bir yapıda sakla.
        Set<String> benzersizMeyveler = new HashSet<>(meyveler);

        Map<String, Integer> urunSayilari = new HashMap<>();

        /** örn muz bu örnekte 3 defa geçiyor. o yüzden mpat içerisinde
         * muz,3
         **/

        for (String meyve : meyveler) {
            if (urunSayilari.containsKey(meyve)) {
                urunSayilari.put(meyve, urunSayilari.get(meyve) + 1);
            } else {
                urunSayilari.put(meyve, 1);
            }
        }

        System.out.println("----özet----");
        System.out.println("tüm ürünler: " + meyveler);
        System.out.println("benzersiz meyveler: " + benzersizMeyveler);
        //kaç ürün var
        System.out.println("farklı meyve miktarı: " + benzersizMeyveler.size());

        //ürün miktarları
        System.out.println("ürün miktarları keyset() ile");
        for (String urun : urunSayilari.keySet()) {
            System.out.println(urun + " - " + urunSayilari.get(urun));
        }                                                                    // ikiside aynı işi yapıyor.
        System.out.println("ürün miktarları entry ile ");
        for (Map.Entry<String, Integer> entry : urunSayilari.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        System.out.println("map içinde value ile gezme: ");
        for (Integer value : urunSayilari.values()) {
            System.out.println(value);
        }


    }
}
