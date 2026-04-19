package gun32.ornek1;

public class KrediKarti extends Odeme{

    public KrediKarti(double tutar) {

        super(tutar);
    }

    @Override
    void odemeYap() {
        System.out.println("kredi kartı ile " + tutar + " ödendi");

    }
}
