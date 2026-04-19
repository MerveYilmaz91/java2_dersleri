package gun29.ornek1;

public class Motorsiklet extends Arac{

    boolean kaskVarmi;

    public Motorsiklet(String plaka, String marka, double gunlukUcret, boolean kiradaMi,boolean kaskVarmi) {
        super(plaka, marka, gunlukUcret, kiradaMi);
        this.kaskVarmi = kaskVarmi;
    }

    @Override
    public void bilgiYaz() {
        super.bilgiYaz();
        System.out.println("kask var mı?");
    }
}
