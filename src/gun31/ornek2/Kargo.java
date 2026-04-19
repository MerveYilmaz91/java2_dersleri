package gun31.ornek2;

public class Kargo {
    private String gonderiSahibiAdi;
    private double paketinAgirligi;
    private GonderimTuru gonderimTuru;

    public Kargo(String gonderiSahibiAdi, double paketinAgirligi, GonderimTuru gonderimTuru) {
        this.gonderiSahibiAdi = gonderiSahibiAdi;
        this.paketinAgirligi = paketinAgirligi;
        this.gonderimTuru = gonderimTuru;
    }

    public String getGonderiSahibiAdi() {
        return gonderiSahibiAdi;
    }

    public void setGonderiSahibiAdi(String gonderiSahibiAdi) {
        this.gonderiSahibiAdi = gonderiSahibiAdi;
    }

    public double getPaketinAgirligi() {
        return paketinAgirligi;
    }

    public void setPaketinAgirligi(double paketinAgirligi) {
        this.paketinAgirligi = paketinAgirligi;
    }

    public GonderimTuru getGonderimTuru() {
        return gonderimTuru;
    }

    public void setGonderimTuru(GonderimTuru gonderimTuru) {
        this.gonderimTuru = gonderimTuru;
    }

    public void bilgiGoster () {
        System.out.println("müşteri adı: " + gonderiSahibiAdi);
        System.out.println("paket ağırlığı: " + paketinAgirligi);
        System.out.println("gönderim türü: " + gonderimTuru);
    }

}
