package gun31.ornek1;

public class AkilliLamba extends Cihaz implements Acilabilir,Baglanabilir{

    private String isikRengi;

    public AkilliLamba(String marka, String model,String isikRengi) {
        super(marka, model);
        this.isikRengi = isikRengi;
    }

    public String getIsikRengi() {
        return isikRengi;
    }

    public void setIsikRengi(String isikRengi) {
        this.isikRengi = isikRengi;
    }

    @Override
    public void bilgi () {
        super.bilgi();
        System.out.println("ışık rengi: " + isikRengi);
    }

    @Override
    public void ac() {
        System.out.println("akıllı lamba açıldı");

    }

    @Override
    public void kapat() {
        System.out.println("akıllı lamba kapandı");

    }

    @Override
    public void interneteBaglan() {
        System.out.println("akıllı lamba internete bağlanabilir");

    }
}
