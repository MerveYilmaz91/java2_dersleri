package gun32.ornek3;

public class Yazilimci extends Calisan{


    public Yazilimci(String ad) {
        super(ad);
    }

    @Override
    void gorev() {
        System.out.println(ad + "kod yazar");

    }
}
