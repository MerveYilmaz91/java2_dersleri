package gun18;

import java.util.*;

public class SetKonuTekrari {
    public static void main(String[] args) {

        ArrayList<String> isimler = new ArrayList<>();
        isimler.add("mehmet");
        isimler.add("alperen");
        isimler.add("gokay");
        isimler.add("hüseyin");
        isimler.add("serhat");
        isimler.add("mehmet");
        isimler.add("kader");
        isimler.add("gülşah");
        isimler.add("hüseyin");

        System.out.println("toplam isim miktarı: " + isimler.size());

        Set<String> benzersizİsimler = new HashSet<>(isimler);
        System.out.println("toplam isim miktarı: " + benzersizİsimler.size());

        //SETLERDE İNDEX YOKTUR. benzersizIsimler.get(0) ->  diye bir kullanım yoktur.

        for(String isim : benzersizİsimler) {
            System.out.println(isim);
        }

        ArrayList<String> indexliBenzersizIsımler = new ArrayList<>(benzersizİsimler);

        System.out.println("1. eleman: " + indexliBenzersizIsımler.get(0));

        System.out.println("-----setler ornek------");
        Set<String> sehirlerHash = new HashSet<>();
        sehirlerHash.add("antalya");
        sehirlerHash.add("muğla");
        sehirlerHash.add("fethiye");
        sehirlerHash.add("çanakkale");

        Set<String> sehirlerLinked = new LinkedHashSet<>();
        sehirlerLinked.add("antalya");
        sehirlerLinked.add("muğla");
        sehirlerLinked.add("fethiye");
        sehirlerLinked.add("çanakkale");

        Set<String> sehirlerTree = new TreeSet<>();
        sehirlerTree.add("antalya");
        sehirlerTree.add("muğla");
        sehirlerTree.add("fethiye");
        sehirlerTree.add("çanakkale");

        System.out.println("hash: " + sehirlerHash);
        System.out.println("linked: " + sehirlerLinked);
        System.out.println("Tree: " + sehirlerTree);





    }
}
