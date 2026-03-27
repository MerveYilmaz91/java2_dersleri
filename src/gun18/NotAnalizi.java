package gun18;

import java.util.*;

public class NotAnalizi {
    public static void main(String[] args) {
        /** bir öğretmen öğrencilerin notlarını bir listede tutuyor.
         * [70,85,70,90,100,85,60,90]
         * istenenler
         * tüm notları bir listede sakla.
         * tekrar etmeyen notları ayrı bir yapıda sakla
         * her notun kaç kez tekrar ettiğini ayrı bir yapıda tut.
         * en çok tekrar eden notu bul ve yazdır.
         * kaç farklı not olduğunu yazdır.
         **/

        //notları bir listede sakladık.
        ArrayList<Integer> notlar = new ArrayList<>();
        notlar.add(70);
        notlar.add(85);
        notlar.add(70);
        notlar.add(90);
        notlar.add(100);
        notlar.add(85);
        notlar.add(60);
        notlar.add(90);

        //tekrar etmeyen notları ayrı bir yapıda sakla.
        Set<Integer> farkliNotlar = new HashSet<>(notlar);

        //her notun kaç kez tekrar ettiğini ayrı bir yapıda tut.
        Map<Integer,Integer> map = new HashMap<>();      //1. integer notun kendisi,2. integer o notun kaç defa geçtiği

        for(Integer not : notlar){
            if(map.containsKey(not)){  //containsKey - daha önce girilmiş mi bunu kontrol eder.
                // map.get(not) -> o anki notun value (deger)'i
                map.put(not,map.get(not)+1);
            } else {
                map.put(not,1);
            }
        }
        System.out.println("----özet----");
        System.out.println("tüm notlar: " + notlar);
        System.out.println("farklı notlar: " + farkliNotlar.size());
        System.out.println("farklı notların miktarı: " + farkliNotlar.size());

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            System.out.println("not: " + entry.getKey() + " - " + "tekrar miktarı: " + entry.getValue());
        }

        int tekrarSayisi = 0;
        int enCokTekrarlananNot= 0;
        for( Integer key : map.keySet()){
            //map.get(key) -> value yi verir.
            //yani o key in tekrar miktarını

            if(map.get(key) > tekrarSayisi){
                tekrarSayisi = map.get(key);
                enCokTekrarlananNot = key;
            }
            System.out.println("en çok tekrarlanan sayı: " + enCokTekrarlananNot);
            System.out.println("tekrar miktarı: " +  tekrarSayisi);
        }
    }
}
