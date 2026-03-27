package gun21;

public class OgrenciNotSistemi {

    public static void ogrenciBilgisiYazdir(String ogrenci, int not) {
        System.out.println("öğrenci bilgileri");
        System.out.println("öğrenci adı: " + ogrenci);
        System.out.println("öğrenci not: " + not);
    }

    public static void sinavDurumu(String ogrenci, int not) {
        if(not >=50 ) {
            System.out.println(ogrenci + "sinavi gecti");
        } else {
            System.out.println();
            System.out.println(ogrenci + "sinavdan kaldı");
        }

    }


    public static void main(String[] args) {

        String ogrenci1 = "mehmet";
        int not1= 99;

        String ogrenci2 = "arzu";
        int not2= 95;

        ogrenciBilgisiYazdir(ogrenci1, not1);
        ogrenciBilgisiYazdir(ogrenci2, not2);

        sinavDurumu(ogrenci1,not1);
        sinavDurumu(ogrenci2,not2);
    }
}
