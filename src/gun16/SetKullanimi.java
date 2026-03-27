package gun16;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetKullanimi {
    public static void main(String[] args) {
        /**
         * 1-HashSet() -> tekrar eden veri tutmaz ama kaydedilen verileri sıralı bir şekilde kaydetmez.
         * diğer set türlerine göre en hızlısıdır.
         *
         * 2- LinkedHashSet() -> tekrar eden veri tutmaz.
         * ama bu sefer kaydedilen verilerin sırasını korur.
         *
         * 3- TreeSet() -> tekrar eden veri tutmaz.
         * eklenen verileri sıralı tutar.
         * yani sayısal verileri küçükten büyüğe, yazısal verileri is alfabetik olarak kaydeder.
         **/

        Set<String> sehirler = new HashSet<>();
        sehirler.add("antalya");
        sehirler.add("muğla");
        sehirler.add("giresun");

        System.out.println("HashSet: " + sehirler);

        System.out.println("----LinkedHashSet----");
        Set<String> isimler = new LinkedHashSet<>();
        isimler.add("asya");
        isimler.add("merve");
        isimler.add("serdar");
        System.out.println("LinkedHashSet: " + isimler);

        System.out.println("----TreeSet----");
        TreeSet<String> isimler2 = new TreeSet<>();
        isimler2.add("asya");
        isimler2.add("merve");
        isimler2.add("serdar");
        isimler2.add("hale");
        isimler2.add("tuğba");
        System.out.println("TreeSet: " + isimler2);







    }
}
