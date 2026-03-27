package gun17;

import java.util.HashMap;

public class UrunFiyatlari {
    public static void main(String[] args) {

        HashMap<String,Integer> sepet = new HashMap<>();
        HashMap<String,Integer> fiyatlar = new HashMap<>();

        fiyatlar.put("elma",10);
        fiyatlar.put("karpuz",20);
        fiyatlar.put("çilek",30);
        fiyatlar.put("kiraz",33);

        System.out.println("karpuzun fiyatı :" + fiyatlar.get("karpuz"));
        System.out.println("toplam ürün sayısı: " + fiyatlar.size());

        if (fiyatlar.containsKey("kiraz")) {
            System.out.println("kiraz listede var");
        } else {
            System.out.println("kiraz listede yok");
        }

        System.out.println("sepetteki ürünler: " + sepet);

        sepet.remove("elma");
        System.out.println("sepette kalan ürünler: " + sepet);

        sepet.clear();
        System.out.println("sepetin son hali: " + sepet);


    }
}
