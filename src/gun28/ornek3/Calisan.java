package gun28.ornek3;

public class Calisan {
    String ad;
    String soyad;
    double maas;

    public Calisan(String ad, String soyad, double maas) {
        this.ad = ad;
        this.soyad = soyad;
        this.maas = maas;
    }

    public void bilgiYazdir() {
        System.out.println("ad: " +ad);
        System.out.println("soyad: " + soyad);
        System.out.println("maaş: " + maas);
        System.out.println();
    }
}
