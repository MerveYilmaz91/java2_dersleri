package gun10;

public class CarpimTablosu {
    public static void main(String[] args) {
        /**
         * 1-5 arası çarpım tablosu ekrana yazdır
         **/

        for (int i = 1; i <= 5; i++) { // satır
            for (int j = 1; j <= 5; j++) { //sutun
                // "%d" -> virgülden sonraki sayıları yazıyor.
                // 4 kullanımı boşluk bırakması için
                System.out.printf("%4d", i*j);
            }
            System.out.println();
        }



    }
}
