package gun30.ornek1;

public class Ordek implements Ucabilir,Yuzebilir,Hayvan{
    @Override
    public void sesCikar() {
        System.out.println("vakladı");

    }

    @Override
    public void beslenir() {
        System.out.println("ot yedi");

    }

    @Override
    public void uyur() {
        System.out.println("gölde uyudu");

    }

    @Override
    public void hareketEder() {
        System.out.println("paytak yürüdü");

    }

    @Override
    public void ucar() {
        System.out.println("havada uçtu");

    }

    @Override
    public void yuzer() {
        System.out.println("gölde");

    }
}
