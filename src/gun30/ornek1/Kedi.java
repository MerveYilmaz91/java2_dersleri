package gun30.ornek1;

import gun21.SinavOrtalamasi;

public class Kedi implements Hayvan{
    @Override
    public void sesCikar() {
        System.out.println("miyavlar");

    }

    @Override
    public void beslenir() {
        System.out.println("fare yedi");

    }

    @Override
    public void uyur() {
        System.out.println("evde uyudu");

    }

    @Override
    public void hareketEder() {
        System.out.println("zıpladı");

    }
}
