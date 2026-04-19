package gun29.ornek1;

public class Arac {

    String plaka;
    String marka;
    double gunlukUcret;
    boolean kiradaMi;

    public Arac(String plaka, String marka, double gunlukUcret, boolean kiradaMi) {
        this.plaka = plaka;
        this.marka = marka;
        this.gunlukUcret = gunlukUcret;
        this.kiradaMi = kiradaMi;
    }

    public String getPlaka() {
        return plaka;
    }

    public String getMarka() {
        return marka;
    }

    public double getGunlukUcret() {
        return gunlukUcret;
    }

    public boolean isKiradaMi() {
        return kiradaMi;
    }
    public void bilgiYaz(){
        System.out.println("plaka: " + plaka);
        System.out.println("marka: " + marka);
        System.out.println("günlük ücret: " + gunlukUcret);
        System.out.println("kirada mı? " + kiradaMi);
    }
}
