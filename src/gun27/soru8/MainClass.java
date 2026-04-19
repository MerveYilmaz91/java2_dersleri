package gun27.soru8;

public class MainClass {
    public static void main (String[] args) {

        /** bir kargo firması, gönderileri takip etmek için bir sistem kurmak istiyor.
         * her kargonın takip numarası, alıcı adı, gönderi durumu ve teslimat notları vardır.
         * gönderi durumu sadece belirli seçeneklerden oluşmaktadır.  // enum
         * alıcı adı boş girilemez.
         * teslimat notları bir listede tutulacak.
         * sistemde, teslimat notlarının içinde "gecikme" kelimesi geçen notları ayrıca ekrana yazdırın.
         * takip numarası ve alıcı adı ile nesne oluştururken ilk bilgiler verilmelidir.
         **/

        Kargo kargo = new Kargo("TR123456" , "Asya");

        kargo.notEkle("kargo şubeden çıktı");
        kargo.notEkle("teslimatta gecikme olabilir");
        kargo.notEkle("adres doğrulması yapıldı");

        kargo.setDurumu(GonderiDurumu.YOLDA);
        kargo.bilgiYazdir();
        System.out.println();
        kargo.gecikmeliNotlar();



    }
}
