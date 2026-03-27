package gun18;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class TekrarsizOgrenciSayisi {
    public static void main(String[] args) {
        /**
         * bir sınıfta öğrencilerin isimleri aşağıdaki gibi listede tutuluyor.
         * ["Ali", "Ayşe", "Ali", "Mehmet", "Ayşe", "Zeynep", "Can" ]
         * istenenler:
         * tüm isimleri bir liste içinde sakla.
         * tekrar eden isimleri çıkarıp sadece benzersiz isimleri ayrı bir yapıda tut
         * kaç farklı öğrenci olduğunu ekrana yazdır.
         * benzersiz isimleri ekrana yazdır.
         **/

        ArrayList<String> isimler = new ArrayList<>();
        isimler.add("ali");
        isimler.add("ayşe");
        isimler.add("ali");
        isimler.add("mehmet");
        isimler.add("ayşe");
        isimler.add("zeynep");
        isimler.add("can");

        Set<String> benzersizIsimler = new HashSet<>(isimler);

        System.out.println("tüm öğrenciler: " + isimler);
        System.out.println("benzersiz isimler: " + benzersizIsimler);
        System.out.println("benzersiz öğrenci miktarı: " +  benzersizIsimler.size());

    }
}
