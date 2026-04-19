package gun32.konu;

public class PolymorphismTurleri {

    //1- Method overloading -> aynı isimli methodun parametrelerini değiştirerek fazla iş yapmasıdır.

    public static int topla(int sayi1,int sayi2) {
        return sayi1 + sayi2;
    }
    public static int topla(int sayi1, int sayi2, int sayi3) {
        return sayi1 + sayi2 + sayi3;
    }
    public static double topla (double sayi1,double sayi2) {
        return sayi1 + sayi2;
    }

    //2- Method Override

    public static void main (String[] args) {
        int toplam = PolymorphismTurleri.topla (2,45) ;
        double toplamD = PolymorphismTurleri.topla(222,45);
        int toplam2 = PolymorphismTurleri.topla(34,45,55);

        System.out.println("1. toplam: " + toplam);
        System.out.println("2. toplam: " + toplamD);
        System.out.println("3. toplam: " + toplam2);

        String text = "bugun hava çok guzel" ;

        System.out.println("0-6 arası: " + text.substring(2,6));
        System.out.println("3 ten sonrası: " + text.substring(3));



    }
}
