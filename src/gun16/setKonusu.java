package gun16;

import java.util.HashSet;
import java.util.Set;

public class setKonusu {
    public static void main(String[] args) {

        /**
         * aynı elemanı 1 den fazla kez saklamaz.
         * istanbul,izmir,ankara,antalya
         * bu örnekte ArrayList -> listeyi olduğu gibi saklar string olarak.
         * set ise ikinci defa girilen izmir string ifadesini saklamaz.
         *
         * tekrar eden verileri önlemek istediğimizde
         * bir elemanın var olup olmadığını kontrol etmek istediğimizde
         * liste gibi sıra önemli değilse
         * benzersiz kayıtlar tutmak istediğimizde kullanılır.
         **/

        Set<String> sehirler = new HashSet<>();
        sehirler.add("istanbul");
        sehirler.add("antalya");
        sehirler.add("muğla");
        sehirler.add("giresun");
        sehirler.add("muğla");
        System.out.println(sehirler);
        System.out.println("eleman sayısı: " + sehirler.size());

        /** setlerde add metodu ile eleman eklemek istediğimde add metodunun cevabı boolean olur.
         * eger var olan degerden ekleme yapmak istersem hata vermez, onun yerine cevap false olur.
         **/

        System.out.println(sehirler.add("antalya"));  //false
        System.out.println(sehirler.add("izmir"));    //true

        /** setlerde index olmuyor!!!
         * sehirler.get(0) diye bir kullanım yok.
         **/

        System.out.println("----------");
        for(String sehir: sehirler){
            System.out.println(sehir);
        }
        // eleman silme

        Set<String> isimler = new HashSet<>();
        isimler.add("merve");
        isimler.add("serdar");
        isimler.add("asya");
        isimler.add("ali");

        System.out.println("silmeden önce: " + isimler);

        isimler.remove("ali");
        System.out.println("sildikten sonra: " + isimler);

        System.out.println("-----------");
        //eleman var mı kontrolü

        System.out.println(isimler.contains("merve"));  //true
        System.out.println(isimler.contains("veli"));   //false



    }
}
