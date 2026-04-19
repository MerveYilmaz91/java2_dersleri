package gun26.ornek2;

public class BankaHesabi {
    private double bakiye;

    BankaHesabi(double bakiye) {
        this.bakiye = bakiye;
    }

    public double getBakiye() {
        return bakiye;

    }

    public void paraYatirma(double miktar) {
        if (miktar > 0) {
            bakiye += miktar;
            System.out.println(miktar + " miktar eklendi. yeni bakiye: " +bakiye);
        }
    }

    public void paraCekme(double miktar) {
        if (miktar > 0 && miktar <= bakiye) {
            bakiye -= miktar;
            System.out.println(miktar + " miktar çekildi.yeni bakiye: " + bakiye);
        } else {
            System.out.println("yetersiz bakiye ya da hatalı işlem");
        }
    }
}
