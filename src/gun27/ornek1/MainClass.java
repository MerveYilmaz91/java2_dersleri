package gun27.ornek1;

public class MainClass {
    public static void main (String[] args) {
        /**
         * bir kavşakta trafik lambasının kırmızı, sarı ve yeşil olmak üzere 3 durumu vardır.
         * lambanın mevcut durumu tutuluyor ve ekrana buna göre sürücüye verilecek mesaj yazdırılıyor.
         **/

        TrafikIsiklari lamba = new TrafikIsiklari(IsikDurumu.KIRMIZI);
        lamba.mesajiGoster();

    }
}
