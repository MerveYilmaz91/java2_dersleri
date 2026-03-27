package gun21;

public class TelefonFaturasi {
    public static int toplamHesapla(int dakika) {
        return dakika * 2;
    }

    public static void indirimKontrolEt(int toplamTutar) {
        if (toplamTutar >=1000) {
            System.out.println("indirim kazandınız");
        } else {
            System.out.println("indirim yok");
        }
    }
    public static void faturaYazdir(String isim, int dakika) {
        int toplamTutar = toplamHesapla(dakika);
        System.out.println("----fatura bilgileri----");
        System.out.println("isim: " + isim);
        System.out.println("kullanılan dakika: " + dakika);
        System.out.println("toplam miktar: " + toplamTutar);
        indirimKontrolEt(toplamTutar);
        System.out.println();
    }
    public static void main(String[] args) {
        faturaYazdir("merve", 100);
        faturaYazdir("asya", 30);
        faturaYazdir("arzu", 180);
        faturaYazdir("mehmet", 1120);



    }
}
