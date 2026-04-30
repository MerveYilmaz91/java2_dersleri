package gun34.ornek2;

public abstract class Yayin {
    String ad;
    String yazarAdi;
    int sayfaSayisi;
    boolean oduncMu;

    public Yayin(String adi, String yazarAdi, int sayfaSayisi, boolean oduncMu) {
        this.ad = adi;
        this.yazarAdi = yazarAdi;
        this.sayfaSayisi = sayfaSayisi;
        this.oduncMu = oduncMu;
    }

    public void bilgiGoster () {
        System.out.println("ad: " + ad + ", yazar adı: " + yazarAdi + "sayfa sayısı: "
                + sayfaSayisi + ", ödünç mü?" + (oduncMu ? "Evet" : "Hayir"));
    }

    public abstract String tur();

    public void oduncAl (Uye uye) {

        if (uye.aktifMi) {
            throw new RuntimeException("Üye aktif değildir.");
        }

        if(oduncMu) {
            throw new RuntimeException(ad + "zaten ödünç verilmiştir.");
        }

        oduncMu = true;
        System.out.println(uye.ad + " , " + ad + " yayını ödünç aldı");
    }

    public void iadeEt () {
        oduncMu = false;
        System.out.println(ad + "iade edildi");
    }

}
