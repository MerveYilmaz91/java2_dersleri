package gun29.ornek4;

public class Doktor extends Calisan{

    private String brans;
    public Doktor(String ad, String soyad, int yas, String gorev,String brans) {
        super(ad, soyad, yas, gorev);
        this.brans = brans;
    }

    public String getBrans() {
        return brans;
    }

    public void setBrans(String brans) {
        this.brans = brans;
    }

    @Override
    public void bilgiyazdir () {
        super.bilgiyazdir();
        System.out.println("branş: " + brans);
    }
}
