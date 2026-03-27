package gun16;

import java.util.*;

public class SetToList {
    public static void main(String args[]) {

        //Setten List e çevirmek
        Set<String> isimler = new HashSet<>();
        isimler.add("ali");
        isimler.add("veli");
        isimler.add("ahmet");
        isimler.add("mehmet");

        System.out.println(isimler);

        //isimler.get(0);
        //bu kullanım hatalı çünkü setlerde index yoktur.

        List<String> isimListesi = new ArrayList<>(isimler);
        System.out.println(isimListesi.get(3));
        //burada cevap Ali çıkmasının sebebi hashSet in kendi algoritmasından dolayı.
        // [ahmet, veli, mehmet, ali]   -> 0,1,2,3 (3) -> 3 = ali

        //List i set e çevirmek
        List<String> liste = new ArrayList<>();
        liste.add("kağıt");
        liste.add("kalem");
        liste.add("silgi");
        liste.add("kağıt");

        System.out.println(liste.size());   // (liste diyince listeyi veriyor. liste.size diyince çıktı : 4 oluyor.
        //bir listede tekrar eden elemanı kaldırmak için kuulanırız.

        Set<String> benzersiz = new HashSet<>(liste);
        System.out.println("set e çevrilmiş hali: " + benzersiz);


        System.out.println("------");
        Set<String> benzersizLinked = new LinkedHashSet<>(liste);
        System.out.println("Linked:  " + benzersizLinked);

        System.out.println("------");
        Set<String> benzersizTree = new TreeSet<>(liste);
        System.out.println("Tree:  " + benzersizTree);


    }
}
