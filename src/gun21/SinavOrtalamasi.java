package gun21;

public class SinavOrtalamasi {
    public static double ortalamaHesapla(int not1,int not2,int not3) {
        return (not1 + not2 + not3) / 3.0;
    }
    public static void sinavDurumu(double ortalama) {
        if (ortalama >= 50) {
            System.out.println("Sinavi geçti");
        }else {
            System.out.println("Sinavi kaldı");
        }
    }

    public static void ogrenciBilgisiYazdir(String isim, int not1, int not2, int not3) {

        double ortalama = ortalamaHesapla(not1,not2,not3);

        System.out.println("--- öğrenci bilgileri----");
        System.out.println("öğrenci ismi: " + isim);
        System.out.println("1. not: " + not1);
        System.out.println("2. not: " + not2);
        System.out.println("3. not: " + not3);
        System.out.printf("ortalama: %.2f%n" , ortalama);
        System.out.println("ortalama: " + Math.round(ortalama));  //math.round virgülden sonrasını attı.
        sinavDurumu(ortalama);

    }



    public static void main(String[] args) {
        //öğrenci ismi ve aldığı notlar
        ogrenciBilgisiYazdir("ali",34,45,98);
        ogrenciBilgisiYazdir("veli",56,77,52);
        ogrenciBilgisiYazdir("can",20,58,65);
        ogrenciBilgisiYazdir("funda",89,85,100);

    }
}
