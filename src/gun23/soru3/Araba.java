package gun23.soru3;

public class Araba {
    String marka;
    String renk;
    int hiz;

    void bilgiYazdir () {
        System.out.println("marka: " + marka);
        System.out.println("renk: " + renk);
        System.out.println("hız: " + hiz);
        System.out.println();
    }

    void hizlan() {
        hiz += 20;
        if (hiz >= 120) {
            System.out.println("hız sınırını aştınız.");
        }
    }

}
