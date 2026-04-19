package gun30.ornek2;

public class KrediKarti implements OdemeYontemi{

    @Override
    public void odemeYap(double tutar) {
        System.out.println("kredi kartı ile" + tutar + "tl ödendi");
    }
}
