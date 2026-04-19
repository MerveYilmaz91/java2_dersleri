package gun32.ornek3;

public class Muhasebe extends Calisan{

    public Muhasebe(String ad) {
        super(ad);
    }

    @Override
    void gorev() {
        System.out.println(ad + "finansal kayıtları kontrol eder");

    }
}
