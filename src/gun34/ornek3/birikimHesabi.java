package gun34.ornek3;

public class birikimHesabi extends Hesap{

    double minBakiye = 1000;

    public birikimHesabi(String hesapSahibi, String hesapNo, double bakiye) {
        super(hesapSahibi, hesapNo, bakiye);
    }

    @Override
    public void paraCek(double miktar) {
        if (miktar <= 0) {
            throw new IllegalArgumentException("çekilecek miktar pozitif olmalıdır.");
        }
        if (miktar > bakiye) {
            throw new RuntimeException("yetersiz bakiye");
        }
        if (bakiye - miktar < minBakiye) {
            throw new RuntimeException("Birikim hesabında minimum bakiye altına düşülemez.");
        }

        bakiye-=miktar;
        System.out.println(hesapNo + " nolu birikim hesabından " + miktar + " TL çekilmiştir.");
        System.out.println("güncel bakiye: " + bakiye);

    }

    @Override
    public String hesapTuru() {
        return "Birikim";
    }
}
