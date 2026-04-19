package gun31.ornek2;

public class AyniGunKargo extends Kargo implements Hesapla{

    double kuryeUcreti;

    public AyniGunKargo(String gonderiSahibiAdi, double paketinAgirligi, double kuryeUcreti) {
        super(gonderiSahibiAdi, paketinAgirligi, GonderimTuru.AYNI_GUN);
        this.kuryeUcreti = kuryeUcreti;
    }

    @Override
    public double ucretHesapla() {
        double toplam = getPaketinAgirligi() *25 + kuryeUcreti;

        if (getPaketinAgirligi() > 10) {
            toplam +=20;
        }
        return toplam;
    }

    @Override
    public void bilgiGoster () {
        super.bilgiGoster();
        System.out.println("kurye ücreti: " + kuryeUcreti);
    }
}
