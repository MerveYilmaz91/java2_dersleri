package gun19;

import java.util.*;

public class FilmTuru {
    public static void main(String[] args) {
        /** kullanıcıdan 10 kişinin sevdiği bir film türü al
         * örnek:
         * aksiyon: ali- veli-hüseyin
         * komedi: izzet, alperen, kader
         * istenenler:
         * tür isimlerini düzenleyip aynı formata getir.
         * hangi türün kaç kişi tarafından seçildiğini hesapla.
         * aynı türü seçen kişileri birlikte göster.
         * sadece 1 kişi tarafından seçilen türleri yazdır.
         * isminin içinde "e" harfi geçen kişileri ayrıca göster.
         * en popüler türü bul ve o türü seçen tüm kişileri yazdır.
         **/

        Scanner scanner=new Scanner(System.in);

        //film türü= key, kişi isimleri= value olcak

        Map<String, List<String>> kisilerVeFilmTurleri =new HashMap<>();

        for (int index = 1; index <= 5; index++) { //10 kişilik veri alacağız.
            System.out.println(index + ". kullanıcı adı: ");           //kişinin adını aldık
            String kisi=scanner.nextLine().toLowerCase().trim();

            System.out.println("sevdiği film türü: ");
            String filmTuru=scanner.nextLine().toLowerCase().trim();     //film türünü aldık

            if(!kisilerVeFilmTurleri.containsKey(filmTuru)){   //mapin içerisinde yoksa eklemek için
                kisilerVeFilmTurleri.put(filmTuru, new ArrayList<>());
            }

            kisilerVeFilmTurleri.get(filmTuru).add(kisi);
        }

        System.out.println("---türlere göre kişiler---");
        for (Map.Entry<String, List<String>> entry : kisilerVeFilmTurleri.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        System.out.println("---türleri izleyenlerin sayısı----");
        for (Map.Entry<String, List<String>> entry : kisilerVeFilmTurleri.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().size());  //size dedik çünkü türü izleyenlerin sayısını bulmak için.
        }






    }
}
