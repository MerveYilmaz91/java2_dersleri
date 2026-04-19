package gun28.ornek4;

public class Arac {
    String plaka;
    String marka;
    double gunlukUcret;

    public Arac(String plaka, String marka, double gunlukUcret) {
        this.plaka = plaka;
        this.marka = marka;
        this.gunlukUcret = gunlukUcret;
    }

    public void bilgiYaz() {
        System.out.println("plaka: " + plaka);
        System.out.println("marka: " + marka);
        System.out.println("günlük ücret: " + gunlukUcret);
    }
}
