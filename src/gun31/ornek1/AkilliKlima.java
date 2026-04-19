package gun31.ornek1;

public class AkilliKlima extends Cihaz implements Acilabilir,Baglanabilir{

    private int sicaklikDerecesi;

    public AkilliKlima(String marka, String model,int sicaklikDerecesi) {
        super(marka, model);
        this.sicaklikDerecesi = sicaklikDerecesi;
    }

    public int getSicaklikDerecesi() {
        return sicaklikDerecesi;
    }

    public void setSicaklikDerecesi(int sicaklikDerecesi) {
        this.sicaklikDerecesi = sicaklikDerecesi;
    }
    @Override
    public void bilgi () {
        super.bilgi();
        System.out.println("sicaklık derecesi: " + sicaklikDerecesi);
    }

    @Override
    public void ac() {
        System.out.println("akıllı klima açıldı");

    }

    @Override
    public void kapat() {
        System.out.println("akıllı klima kapandı");

    }

    @Override
    public void interneteBaglan() {
        System.out.println("akıllı klima internete bağlandı");

    }
}
