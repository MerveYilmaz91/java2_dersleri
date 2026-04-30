package gun34.ornek1;

public class Urun {
    String ad;
    double fiyat;
    int stok;

    public Urun(String ad, double fiyat, int stok) {
        this.ad = ad;
        this.fiyat = fiyat;
        this.stok = stok;
    }

    public double fiyatHesapla() {
        return fiyat;

    }
    public void bilgiYaz() {
        System.out.println("ad " + ad + "fiyat: " + fiyat + "stok adedi: " + stok);
    }

    public void satinAl (int adet) {

        if (adet < 0) {
            throw new IllegalArgumentException("negatif adet girilemez.");
        }

        if (adet > stok) {
            throw new RuntimeException(ad + " için stok miktarı yetersiz");

        }
        stok -= adet;

        System.out.println(adet + " tane " + ad + " alınmıştır.");

    }


}
