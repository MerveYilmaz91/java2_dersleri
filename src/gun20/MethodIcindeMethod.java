package gun20;

public class MethodIcindeMethod {

    public static int toplam(int sayi1, int sayi2) {
        return sayi1 + sayi2;
    }

    public static void toplamYazdir(int sayi1, int sayi2) {
        int toplam = toplam(sayi1, sayi2);  //diğer metodu bu metod içinde kullandık.
        System.out.println(toplam);
    }

    public static void main(String[] args) {
        toplamYazdir(10,2);
        toplamYazdir(85,56);
        toplamYazdir(235,522);
    }
}
