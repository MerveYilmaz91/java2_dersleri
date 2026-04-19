package gun31.ornek2;

public class HizliKargo extends Kargo implements Hesapla{

    Boolean sehirDisiMi;

    public HizliKargo(String gonderiSahibiAdi, double paketinAgirligi,boolean sehirDisiMi) {
        super(gonderiSahibiAdi, paketinAgirligi, GonderimTuru.HIZLI);
        this.sehirDisiMi = sehirDisiMi;
    }

    @Override
    public double ucretHesapla() {
        double toplam = getPaketinAgirligi() *18;

        if(sehirDisiMi) {
            toplam += 30;
        }
        if (getPaketinAgirligi() > 10) {
            toplam += 20;
        }
        return toplam;
    }

    @Override
    public void bilgiGoster () {
        super.bilgiGoster();
        System.out.println("sehir dışı mı? " + sehirDisiMi);
    }
}
