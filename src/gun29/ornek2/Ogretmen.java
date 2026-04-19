package gun29.ornek2;

public class Ogretmen extends Kullanici {

    int verdigiDersSayisi;
    String uzmanlikAlani;


    public Ogretmen(String ad, String soyad, String email, boolean uyelikDurumu,int verdigiDersSayisi,String uzmanlikAlani) {
        super(ad, soyad, email, uyelikDurumu);
        this.verdigiDersSayisi = verdigiDersSayisi;
        this.uzmanlikAlani = uzmanlikAlani;
    }

    @Override
    public void bilgiyaz () {
        super.bilgiyaz() ;
        System.out.println("verdiği ders sayısı: " + verdigiDersSayisi);
        System.out.println("uzmanlık alanı: " + uzmanlikAlani);
    }





}
