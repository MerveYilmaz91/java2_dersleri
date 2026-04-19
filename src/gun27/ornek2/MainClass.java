package gun27.ornek2;

public class MainClass {
    public static void main (String[] args) {
        /**
         * bir sinema uygulamasında film adı, koltuk numarası ve bilet fiyatı tutuluyor.
         * bilet oluştururken bu bilgiler giriliyor.
         * daha sonra bilet bilgileri ekrana yazdırılıyor.
         **/

        Bilet bilet = new Bilet("harry potter" , 12, 45);
        bilet.biletYazdir();

        Bilet bilet2 = new Bilet("babam ve oğlum" , 55, 100);
        bilet2.biletYazdir();


    }
}
