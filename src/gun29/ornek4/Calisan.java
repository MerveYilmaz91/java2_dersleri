package gun29.ornek4;

public class Calisan {
    private String ad;
    private String soyad;
    private int yas;
    private String gorev;


    public Calisan(String ad, String soyad, int yas, String gorev) {
        this.ad = ad;
        this.soyad = soyad;
        this.yas = yas;
        this.gorev = gorev;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        if (yas<0) {
            System.out.println("yas negatif olamaz.");
        }else {
            this.yas = yas;
        }

    }

    public String getGorev() {
        return gorev;
    }

    public void setGorev(String gorev) {
        this.gorev = gorev;
    }
    public void bilgiyazdir () {
        System.out.println("ad ve soyad: " + ad + " " + soyad);
        System.out.println("yas: " + yas);
        System.out.println("görev yeri: " + gorev);
    }

}

