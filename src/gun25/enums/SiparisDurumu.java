package gun25.enums;

public enum SiparisDurumu {
    HAZIRLANIYOR("kargo hazırlanıyor"),
    KARGODA("kargo yolda"),
    TESLIM_EDILDI("kargo teslim edildi"),
    IPTAL_EDILDI("kargo iptal edildi");

    String aciklama;

    SiparisDurumu(String aciklama) {
        this.aciklama = aciklama;

    }

}
