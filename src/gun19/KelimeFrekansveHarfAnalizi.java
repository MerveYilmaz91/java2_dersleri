package gun19;

import java.util.*;
import java.util.logging.SocketHandler;

public class KelimeFrekansveHarfAnalizi {
    public static void main(String[] args) {
        /**
         * Kullanıcıdan bir cümle al.
         * İstenenler:
         * Cümleyi kelimelere ayır.
         * Kelimeleri düzenleyip aynı formata getir.
         * Her kelimenin kaç kez geçtiğini hesapla.         kelime=key   kaç kez geçtiği=value
         * Tekrar etmeyen kelimeleri göster.
         * Uzunluğu 4’ten büyük olan kelimeleri ayrı yazdır.
         * En çok geçen kelimeyi bul.
         * Cümlede kullanılan farklı kelimeleri
         * alfabetik düşünmeden tekil şekilde ekrana yazdır.
         **/

        Scanner scanner = new Scanner(System.in);    //kullanıcıdan veri aldık

        System.out.println("bir cümle girin: ");
        String cumle = scanner.nextLine().trim();  // trim ile boşlukları temizledik

        String[] kelimeler = cumle.split(" "); //split ile cümleyi ayırdık.

        Map<String,Integer> kelimeSayilari = new HashMap<>();  // kelimenin kaç kez geçtiği; kelime=key kaç kez geçtiği=value

        Set<String> benzersizKelimeler = new HashSet<>();  //tekrar etmeyen kelimeleri göstermek için.

        List<String> uzunKelimeler = new ArrayList<>(); //uzunluğu 4 den büyük olan kelimeler için

        //şimdi kelimeler içerinde gezeceğiz.

        for (String kelime: kelimeler) {
            kelime = kelime.trim();  //kelimenin başında gereksiz boşluk varsa diye temizleme yaptık.

            if (kelimeSayilari.containsKey(kelime)) {
                kelimeSayilari.put(kelime, kelimeSayilari.get(kelime) + 1);  //bu cümle daha önce geçiyorsa = +1
            } else  {
                kelimeSayilari.put(kelime, 1); //bu kelime ilk defa geçiyorsa ,1
            }
            benzersizKelimeler.add(kelime);  //aynı kelime gelirse otomatik set onu kaydetmez.

            if (kelime.length() > 4 && !uzunKelimeler.contains(kelime))  {  //contains bu listenin içerisinde bu kelime yoksa ekleme yap anlamına geliyor.
                uzunKelimeler.add(kelime);  //4 den büyük olan kelimeler.
            }
        }

        String enCokGecenKelime= "";
        int max = 0;

        for(Map.Entry<String,Integer> entry: kelimeSayilari.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                enCokGecenKelime = entry.getKey();       //en çok geçen kelimeyi buluyoruz.
            }
        }

        System.out.println("---kelimeler ve miktarları-------");
        for(Map.Entry<String,Integer> entry: kelimeSayilari.entrySet()) {
            System.out.println("kelime: " + entry.getKey() + ", miktarı:  " + entry.getValue());
        }

        System.out.println("---benzersiz kelimeler---");
        System.out.println(benzersizKelimeler);
        System.out.println("---en çok geçen kelime ve miktarları---");
        System.out.println(enCokGecenKelime +  " - " + max);

        scanner.close();
    }
}
