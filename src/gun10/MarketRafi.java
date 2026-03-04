package gun10;

public class MarketRafi {
    public static void main(String[] args) {
        /**
         * 3 raf var, her rafta 4 ürün var.
         * etiketler Raf1-Urun1 ...raf3-urun4 seklinde yazsın.
         * ayrıca ürün numarası çiftse yanına (kampanya) yazsın
         **/

        for (int raf = 1; raf <= 3; raf++) { //dış döngü : raflar
            for (int urun = 1; urun <= 4; urun++) { // iç döngü: ürünler
                System.out.print("Raf" + raf + " " + "-urun" + urun);

                if (urun %2 == 0) {
                    System.out.print(" (kampanya)");
                }
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
