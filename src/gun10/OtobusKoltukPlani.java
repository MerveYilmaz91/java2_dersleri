package gun10;

public class OtobusKoltukPlani {
    public static void main(String[] args) {
        /**
         * otobuste 4 sıra var, her sırada 3 koltuk var
         * koltukları 1A,1B,1C ... 4C Şeklinde ekrana yazdır.
         **/

        int siraSayisi = 4;
        int siradakiKoltukSayisi = 3;

        //dış döngü bize sıra numarasını verir.
        for (int sira = 1; sira <= siraSayisi; sira++) {
            // iç döngü bize koltuk harflerini verir.
            for (int siradakiKoltuk = 0; siradakiKoltuk < siradakiKoltukSayisi; siradakiKoltuk++) {

                // 0->A, 1->B, 2->C
                char koltukAdi = (char) ('A' + siradakiKoltuk);

                System.out.print(sira + "" + koltukAdi + " ");
            }
            System.out.println();  //sırayı yazdıktan sonra alt satıra inmesi için kullandık.
        }

    }
}
