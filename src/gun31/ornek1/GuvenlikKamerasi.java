package gun31.ornek1;

public class GuvenlikKamerasi extends Cihaz implements Acilabilir,Baglanabilir{

    private String cozunurluk;

    public GuvenlikKamerasi(String marka, String model,String cozunurluk) {
        super(marka, model);
        this.cozunurluk=cozunurluk;
    }

    public String getCozunurluk() {
        return cozunurluk;
    }

    public void setCozunurluk(String cozunurluk) {
        this.cozunurluk = cozunurluk;
    }
    @Override
    public void bilgi () {
        super.bilgi();
        System.out.println("çözünürlük: " + cozunurluk);
    }

    @Override
    public void ac() {
        System.out.println("kamera açıldı");

    }

    @Override
    public void kapat() {
        System.out.println("kamera kapatma yetkisi admindedir");

    }

    @Override
    public void interneteBaglan() {
        System.out.println("kamera internete bağlandı");

    }
}
