package gun30.ornek1;

public class Kopek implements Hayvan{
    @Override
    public void sesCikar() {
        System.out.println("havlar");

    }

    @Override
    public void beslenir() {
        System.out.println("et yedi");

    }

    @Override
    public void uyur() {
        System.out.println("sokakta uyudu");

    }

    @Override
    public void hareketEder() {
        System.out.println("atladı");

    }
}
