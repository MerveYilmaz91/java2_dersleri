package gun29.ornek3;

public class Icecek extends Urun{

    private double litre;

    public Icecek(String ad, double fiyat, String kategori,double litre) {
        super(ad, fiyat, kategori);
        this.litre = litre;

    }

    public double getLitre() {
        return litre;
    }

    public void setLitre(double litre) {
        this.litre = litre;
    }

    @Override

    public void bilgiyaz(){
        super.bilgiyaz();
        System.out.println("litre: " + litre);
    }
}
