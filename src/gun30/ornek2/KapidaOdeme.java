package gun30.ornek2;

import gun21.SinavOrtalamasi;

public class KapidaOdeme implements OdemeYontemi{
    @Override
    public void odemeYap(double tutar) {
        System.out.println("kapıda ödeme ile" + tutar + "tl ödenmiştir.");

    }
}
