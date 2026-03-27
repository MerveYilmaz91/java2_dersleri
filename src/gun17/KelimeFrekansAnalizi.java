package gun17;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class KelimeFrekansAnalizi {
    public static void main(String[] args) {

        /** kullanıcıdan bir cümle al,
         * cümleyi tamamıyla küçük harflere çevir.
         * nokta ve virgül gibi işaretleri temizle.
         * her kelimenin kaç kez tekrarlandığını kaydet.
         * sadece 2 veya daha fazla girilen kelimeleri yazdır.
         * en çok geçen kelimeyi ayrıca yazdır.
         **/

        Scanner scanner = new Scanner(System.in);
        System.out.println("bir cümle girin: ");
        String cumle = scanner.nextLine().trim().toLowerCase();
        //girilen cümleden baştaki ve sonraki boşlukları sildikten sonra tüm cümleyi küçük harflere çevirdik.

        cumle = cumle.replace(".","")
                .replace(",","")
                .replace("?","")
                .replace("!","");         //noktalama işaretlerini temizlemek için replace kullandık.

        String [] kelimeler =  cumle.split(" ");
        //cümle içinde geçen kelimeleri ayırıp, kelimeler array i içerisine kaydettik.

        HashMap<String, Integer> frekans =  new HashMap<>();

        for(int index=0; index<kelimeler.length; index++) {
            String kelime = kelimeler[index];

            if(kelime.isEmpty()) {
                continue;
            }
            if(frekans.containsKey(kelime)) {
                frekans.put(kelime, frekans.get(kelime) + 1);
            }else  {
                frekans.put(kelime, 1);
            }
        }

        String enCokKullanilanKelime = "";
        int tekrarMiktari = 0;

        for(Map.Entry<String, Integer> entry: frekans.entrySet()) {
            String k= entry.getKey();
            int miktar = entry.getValue();

            if(miktar>=2) {
                System.out.println(k + " -> " + miktar);
            }
            if(miktar>=tekrarMiktari) {
                tekrarMiktari = miktar;
                enCokKullanilanKelime = k;
            }
        }
        System.out.println("-------------");
        System.out.println("En çok kullanılan kelime: " +  enCokKullanilanKelime);
        System.out.println("miktarı: " + tekrarMiktari);

    }
}
