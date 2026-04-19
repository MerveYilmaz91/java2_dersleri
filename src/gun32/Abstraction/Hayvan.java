package gun32.Abstraction;

public abstract class Hayvan {
    String ad;

    public Hayvan (String ad) {
        this.ad = ad;

    }

    void yemekYe() {
        System.out.println(ad + "yemek yiyor");
    }

    //interface lerde olduğu gibi gövdesiz metod tanımladık.
    //her hayvanda farklı çalışacak.

    abstract void sesCikar ();


}
