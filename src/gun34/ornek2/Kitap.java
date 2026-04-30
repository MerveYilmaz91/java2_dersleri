package gun34.ornek2;

public class Kitap extends Yayin{

    public Kitap(String adi, String yazarAdi, int sayfaSayisi, boolean oduncMu) {
        super(adi, yazarAdi, sayfaSayisi, oduncMu);
    }

    @Override
    public String tur() {
        return "Kitap";
    }
}
