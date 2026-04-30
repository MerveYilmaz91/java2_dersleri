package gun34.ornek3;

public class vadesizHesap extends Hesap{

    public vadesizHesap(String hesapSahibi, String hesapNo, double bakiye) {
        super(hesapSahibi, hesapNo, bakiye);
    }

    @Override
    public void paraCek(double miktar) {
        if(miktar <= 0) {
            throw new IllegalArgumentException("çekilecek miktar pozitif olmalıdır.");
        }

        if(miktar> bakiye) {
            throw new RuntimeException("yetersiz bakiye");

        }

        bakiye -= miktar;
        System.out.println(hesapNo + " hesabından " + miktar + "çekilmiştir.");
        System.out.println("güncel bakiye " + bakiye);

    }

    @Override
    public String hesapTuru() {
        return "Vadesiz";
    }
}
