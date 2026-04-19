package gun27.ornek5;

public class Uye {
    private String adi;
    private int kitapSayisi;

    public Uye(String adi, int kitapSayisi) {
        this.adi = adi;
        this.kitapSayisi = kitapSayisi;
    }
    public void kitapAl() {
        if(kitapSayisi < 3) {
            kitapSayisi ++;
            System.out.println("kitap alındı");
        }else {
            System.out.println("3 ten fazla kitap alınamaz");
        }
    }

    public void kitapİadeEt() {
        if(kitapSayisi > 0) {
            kitapSayisi --;
            System.out.println("kitap iade edildi");
        }
    }

    public void bilgileriGoster() {
        System.out.println("üye adı: " + adi);
        System.out.println("ödünç kitap sayısı: " + kitapSayisi);

    }

}
