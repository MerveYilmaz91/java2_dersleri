package gun28.ornek2;

public class Kopek extends Hayvan {

    public Kopek(boolean yasiyorMu,String ad) {
        super(yasiyorMu,ad);
    }
    @Override
    public void sesCikar() {
        System.out.println("köpek havlar");
        System.out.println();
    }
}
