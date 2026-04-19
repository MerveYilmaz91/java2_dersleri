package gun23;

public class Araba {

    //Fields (özellikler)
    String marka;
    String model;
    double motor;
    String renk;
    boolean manuelMi;
    int hiz;

    // davranışları
    void hizlan() {
        hiz += 20;
    }
    void yavasla() {
        hiz -= 20;
    }
    void bilgileriniYazdir() {
        System.out.println("marka : " + marka);
        System.out.println("model : " + model);
        System.out.println("motor : " + motor);
        System.out.println("renk : " + renk);
        System.out.println("manuel Mi : " + manuelMi);
        System.out.println("hiz : " + hiz);
        System.out.println();


    }


}
