package gun32.ornek1;

public class NakitOdeme extends Odeme {
    public NakitOdeme(double tutar) {
        super(tutar);
    }

    @Override
    void odemeYap() {
        System.out.println("Nakit ödeme ile " + tutar + " ödendi");

    }
}
