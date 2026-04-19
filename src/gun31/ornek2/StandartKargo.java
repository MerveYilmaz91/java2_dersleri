package gun31.ornek2;

import gun29.ornek4.Doktor;

public class StandartKargo extends Kargo implements Hesapla {


    public StandartKargo(String gonderiSahibiAdi, double paketinAgirligi) {
        super(gonderiSahibiAdi, paketinAgirligi, GonderimTuru.STANDART);
    }

    @Override
    public double ucretHesapla() {
        double toplam = getPaketinAgirligi() * 12;

        if(getPaketinAgirligi() > 10) {
            toplam += 20;

        }

        return toplam;


    }
}

