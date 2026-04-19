package gun29.ornek4;

public class Sekreter extends Calisan{

    private int masaNumarasi;

    public Sekreter(String ad, String soyad, int yas, String gorev, int masaNumarasi) {
        super(ad, soyad, yas, gorev);
        this.masaNumarasi=masaNumarasi;
    }

    public int getMasaNumarasi() {
        return masaNumarasi;
    }

    public void setMasaNumarasi(int masaNumarasi) {
        this.masaNumarasi = masaNumarasi;
    }

    @Override
    public void bilgiyazdir (){
        super.bilgiyazdir();
        System.out.println("masa numarasi: " + masaNumarasi);
    }
}
