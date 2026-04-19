package gun28.ornek1;

public class Calisan {
    private String fullName;
    private double maas;
    private int yas;
    private String address;
    protected Role role;

    public Calisan(String fullName, double maas, int yas, String address,Role role) {
        this.fullName = fullName;
        this.maas = maas;
        this.yas = yas;
        this.address = address;
        this.role = role;
    }

    public void bilgiYazdir () {
        System.out.println("isim: " + fullName);
        System.out.println("maaş: " + maas);
        System.out.println("yaş: " + yas);
        System.out.println("adress: " + address);
        System.out.println("role: " + role);
        System.out.println();
    }
}
