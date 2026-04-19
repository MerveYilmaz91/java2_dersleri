package gun32.ornek3;

public abstract class Calisan {

    String ad;

    public Calisan(String ad) {
        this.ad = ad;
    }

    void bilgi() {
        System.out.println(ad + "işe alındı");
    }
    abstract void gorev();

}
