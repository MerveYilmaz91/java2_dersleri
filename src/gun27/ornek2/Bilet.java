package gun27.ornek2;

public class Bilet {
    private String filmAdi;
    private int koltukNo;
    private double fiyat;

    public Bilet(String filmAdi, int koltukNo, double fiyat) {
        this.filmAdi = filmAdi;
        this.koltukNo = koltukNo;
        this.fiyat = fiyat;
    }

    public void biletYazdir() {
        System.out.println("----bilet bilgileri: -----");
        System.out.println("film: " + filmAdi);
        System.out.println("koltuk no: " + koltukNo);
        System.out.println("fiyat: " + fiyat);

    }
}
