package gun34.ornek3;

public class ogrenciHesabi extends Hesap{

    public ogrenciHesabi(String hesapSahibi, String hesapNo, double bakiye) {
        super(hesapSahibi, hesapNo, bakiye);
    }

    @Override
    public void paraCek(double miktar) {
        if(miktar <= 0) {
            throw new IllegalArgumentException("çekilecek miktar pozitir olmalı");
        }
        if (miktar > bakiye) {
            throw new RuntimeException("yetersiz bakiye");
        }
        bakiye -= miktar;
        System.out.println(hesapNo + " nolu öğrenci hesabından " + miktar + " TL cekilmiştir.");

    }

    @Override
    public String hesapTuru() {
        return "Ogrenci";
    }
}
