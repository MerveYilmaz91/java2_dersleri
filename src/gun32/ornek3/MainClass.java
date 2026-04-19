package gun32.ornek3;

public class MainClass {

    public static void main (String[] args) {
        /**
         * Bir şirkette farklı çalışan türleri vardır.
         * Yazılımcı
         * Muhasebeci
         * Tüm çalışanların adı ortaktır.
         * Ama yaptıkları iş farklıdır.
         * Buna göre abstraction yapısı kurunuz.
         **/

        Yazilimci yazilimci = new Yazilimci("merve");
        Muhasebe muhasebe = new Muhasebe("serdar");

        yazilimci.bilgi();
        yazilimci.gorev();

        System.out.println();

        muhasebe.bilgi();
        muhasebe.gorev();




    }
}
