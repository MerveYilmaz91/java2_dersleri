package gun25.ornek1;

public class Ogrenci {

    public String ad;
    public int yas;

    //parametresiz:
    public Ogrenci() {
        ad = "bilinmiyor";
        yas = 1;
    }

    public Ogrenci(String isim, int age) {
        ad = isim;
        yas = age;
    }
}
