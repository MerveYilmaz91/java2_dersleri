package gun32.ornek1;

public abstract class Odeme {

    double tutar;

    public Odeme(double tutar) {
        this.tutar = tutar;
    }

    void bilgi() {
        System.out.println("ödenecek tutar girin: "  + tutar + "TL dir.");
    }

    abstract void odemeYap();


}
