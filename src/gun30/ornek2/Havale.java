package gun30.ornek2;

import gun21.SinavOrtalamasi;

public class Havale implements OdemeYontemi{
    @Override
    public void odemeYap(double tutar) {
        System.out.println("havale ile " + tutar + "TL ÖDENMİŞTİR.");

    }
}
