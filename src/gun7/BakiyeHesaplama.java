package gun7;

public class BakiyeHesaplama {
    public static void main(String[] args) {
        int bakiye = 30;
        int binisUcreti = 12;
        int binisSayisi = 0;

        while (bakiye >= binisUcreti) {
            bakiye -= binisUcreti;
            binisSayisi++;

            System.out.println("binis yapıldı. Kalan bakiye: " + bakiye);

        }
        System.out.println("Toplam binis sayisi: " + binisSayisi);





    }
}
