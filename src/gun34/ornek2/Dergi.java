package gun34.ornek2;

public class Dergi extends Yayin{

    public Dergi(String adi, String yazarAdi, int sayfaSayisi, boolean oduncMu) {
        super(adi, yazarAdi, sayfaSayisi, oduncMu);
    }

    @Override
    public String tur() {
        return "Dergi";
    }
}
