package gun32.Abstraction;

public class Kedi extends Hayvan{
    public Kedi (String ad) {
        super(ad);
    }
    @Override
    void sesCikar() {
        System.out.println("tekir miyavladı");

    }
}
