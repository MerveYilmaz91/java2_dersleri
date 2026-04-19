package gun31.ornek2;

public class MainClass {
    public static void main (String[] args) {

        /**
         * Bir kargo firmasında farklı türde gönderiler bulunmaktadır.
         * Tüm gönderilerin ortak olarak şu bilgileri vardır:

         * gönderi sahibi adı
         * paket ağırlığı
         * gönderim türü

         * Ancak bazı gönderiler ek özelliklere sahiptir:

         * Standart Kargo için ek özellik yoktur.
         * Hızlı Kargo için ek olarak şehir dışı durumu bilgisi vardır.
         * Aynı Gün Teslim Kargo için ek olarak kurye ücreti bilgisi vardır.

         * Gönderim türleri şunlardır:

         * Standart
         * Hızlı
         * Aynı Gün

         * Sistemde tüm kargo türleri için ücret hesaplama işlemi yapılmalıdır.

         * Ücret kuralları:

         * Standart Kargo için ücret = ağırlık * 12
         * Hızlı Kargo için ücret = ağırlık * 18
         * Eğer şehir dışı ise toplam ücrete 30 TL eklenir.
         * Aynı Gün Teslim Kargo için ücret = ağırlık * 25 + kurye ücreti

         * Ek kural:

         * Eğer paket ağırlığı 10 kg’dan fazlaysa,
         * hangi kargo türü olursa olsun toplam ücrete 20 TL eklenir.

         * Programdan istenenler:

         * Ortak bilgileri tutan bir üst sınıf oluşturun.
         * Bu yapıdan yararlanarak:

         * StandartKargo
         * HizliKargo
         * AyniGunKargo

         * sınıflarını oluşturun.
         * Ücret hesaplama işlemini tüm kargo türleri için zorunlu hale getirin.
         * Gönderim türlerini sabit ve düzenli bir yapı ile yönetin.
         * En az 3 farklı kargo nesnesi oluşturun.

         * Her kargonun:
         * müşteri adını
         * ağırlığını
         * gönderim türünü
         * hesaplanan toplam ücretini
         * ekrana yazdırın.

         * Toplam ücreti 200 TL’den fazla olan gönderiler için:
         * "Bu gönderi özel işlem gerektirir."
         * mesajını yazdırın.
         * En pahalı gönderiyi bulun ve ekrana yazdırın.
         **/

        StandartKargo standartKargo = new StandartKargo("merve", 25);
        HizliKargo hizliKargo = new HizliKargo("Asya", 15,true);
        AyniGunKargo ayniGunKargo = new AyniGunKargo("Serdar", 40,60);

        System.out.println("---1. kargo----");
        standartKargo.bilgiGoster();
        double standartUcret = standartKargo.ucretHesapla();
        System.out.println("toplam ucret: " + standartKargo);
        if (standartUcret > 200) {
            System.out.println("bu gönderi özel işlem gerektirir");
        }

        System.out.println();
        System.out.println("----2. kargo----");
        hizliKargo.bilgiGoster();
        double hizliKargoUcret = hizliKargo.ucretHesapla();
        System.out.println("toplam ucret: " + hizliKargoUcret);

        if (hizliKargoUcret > 200) {
            System.out.println("bu gönderi özel işlem gerektirir");
        }

        System.out.println();

        System.out.println("----3. kargo----");

        ayniGunKargo.bilgiGoster();
        double ayniGunUcret  = ayniGunKargo.ucretHesapla();
        System.out.println("toplam ucret: " + ayniGunUcret);
        if (ayniGunUcret > 200 ) {
            System.out.println("bu gönderi özel işlem gerektirir");
        }

        System.out.println();

        double enYuksekUcret = standartUcret;
        String enPahaliMusteri = standartKargo.getGonderiSahibiAdi();

        if (hizliKargoUcret > enYuksekUcret) {
            enYuksekUcret = hizliKargoUcret;
            enPahaliMusteri = hizliKargo.getGonderiSahibiAdi();
        }

        if (ayniGunUcret > enYuksekUcret) {
            enYuksekUcret = ayniGunUcret;
            enPahaliMusteri = ayniGunKargo.getGonderiSahibiAdi();
        }

        System.out.println("en yüksek kargo ücreti: " + enYuksekUcret);
        System.out.println("en pahalı müşteri adı : " + enPahaliMusteri);



    }
}
