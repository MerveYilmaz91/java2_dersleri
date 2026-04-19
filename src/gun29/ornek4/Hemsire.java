package gun29.ornek4;

public class Hemsire extends Calisan{

    private int nobetSayisi;
    public Hemsire(String ad, String soyad, int yas, String gorev,int nobetSayisi) {
        super(ad, soyad, yas, gorev);
        this.nobetSayisi = nobetSayisi;
    }

    public int getNobetSayisi() {
        return nobetSayisi;
    }

    public void setNobetSayisi(int nobetSayisi) {
        this.nobetSayisi = nobetSayisi;
    }

    @Override
    public void bilgiyazdir(){
        super.bilgiyazdir();

        System.out.println("nöbet sayısı: " + nobetSayisi);
    }
}
