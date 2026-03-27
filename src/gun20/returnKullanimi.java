package gun20;

public class returnKullanimi {

    // 1

    public static int kontrolEt(int sayi) {
        if (sayi < 0) {
            return 0;
        }
        return sayi;
    }

    // 2

    public static void yasKontrolu(int yas) {
        if (yas < 0) {
            System.out.println("yas 0 dan küçük olamaz.");
            return;  // geriye değer döndürmek için değil metodu bitirmek için kullanıldı.
        }
        System.out.println("yas: " + yas);
    }

    public static void main(String[] args) {
        /**
         * return 2 şekilde kullanılır.
         * 1- geriye bir değer döndürüyor.
         * 2- metodu bitirmek için kullanılır.
         **/

        int number = kontrolEt(43);
        System.out.println("sayı: "  + number);
        yasKontrolu(-23);
        yasKontrolu(40);
    }
}
