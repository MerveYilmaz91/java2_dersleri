package gun27.ornek4;

public class MainClass {
    public static void main (String[] args) {

        /**
         * bir restoranda çorba, ana yemek ve tatlı seçimi yapılıyor.
         * sipariş nesnesi müşterinin adı ve seçtiği menü türü ile oluşturuluyor.
         * menü türüne göre ekrana açıklama yazdırılıyor.
         **/

        Siparis siparis = new Siparis("Merve", MenuTuru.TATLI);
        siparis.siparisDetayi();

        Siparis siparis2 = new Siparis("Merve", MenuTuru.ANAYEMEK);
        siparis2.siparisDetayi();




    }
}
