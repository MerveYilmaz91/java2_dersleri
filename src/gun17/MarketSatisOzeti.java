package gun17;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MarketSatisOzeti {
    public static void main(String[] args) {
        /**
         * bir markette gün boyunca satılan ürünler sırasıyla giriliyor.
         * kullanıcı kaç satış yapacağı bilgisini giriyor.
         * her satışta sadece ürün adı girilsin.
         * 1-her ürünün kaç defa satıldığını bulun.
         * 2-satış sonunda tüm ürünleri ve satış miktarlarını yazdırın.
         * 3-en çok satılan ürünü bulup yazdırın.
         * 4-hiç girilmeyen ürünler için işlem yapmayın.
         **/

        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> urunler = new HashMap<>();

        System.out.println("kaç ürün girmek istiyorsunuz? ");
        int adet = scanner.nextInt();
        scanner.nextLine();

        for (int index = 1; index <= adet; index++) {
            System.out.println(index + ". ürün adı: ");
            String name = scanner.nextLine().trim();

            if (urunler.containsKey(name)) {
                urunler.put(name, urunler.get(name) + 1);
            } else  {
                urunler.put(name, 1);
            }
        }

        System.out.println("----özet----");

        String enCokSatilanUrun= "";
        int maxSatis= 0;

        for (Map.Entry<String, Integer> entry : urunler.entrySet()) {
            System.out.println("ürün adı: " + entry.getKey() + " - " + "satış miktarı: " + entry.getValue());
            if (entry.getValue() > maxSatis) {
                maxSatis = entry.getValue();
                enCokSatilanUrun = entry.getKey();
            }
        }

        System.out.println("----------");
        System.out.println("en çok satılan ürün: " + enCokSatilanUrun);
        System.out.println("satış miktarı: " + maxSatis);



    }
}
