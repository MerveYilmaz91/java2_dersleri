package gun25.ornek2;

public class Calisan {

    public Calisan(String isim, String deparman, double maas, boolean isActive) {
        this.isim = isim;
        this.deparman = deparman;
        this.maas = maas;
        this.isActive = isActive;
    }
    public String isim;
    public String deparman;
    public double maas;
    public boolean isActive;

    public Calisan() {
    }
    public Calisan(String isim, String deparman) {
        this.isim = isim;
        this.deparman = deparman;
    }
    public Calisan(String isim, double maas) {
        this.isim = isim;
        this.maas = maas;
    }
    public Calisan(String deparman, boolean maas) {
        this.deparman = deparman;
        this.isActive = maas;
    }


    @Override
    public String toString() {
        return "Calisan{" +
                "isim='" + isim + '\'' +
                ", deparman='" + deparman + '\'' +
                ", maas=" + maas +
                ", isActive=" + isActive +
                '}';
    }
}
