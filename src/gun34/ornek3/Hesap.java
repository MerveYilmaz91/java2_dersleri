package gun34.ornek3;

public abstract class Hesap {
    String hesapSahibi;
    String hesapNo;
    double bakiye;

    public Hesap(String hesapSahibi, String hesapNo, double bakiye) {
        this.hesapSahibi = hesapSahibi;
        this.hesapNo = hesapNo;
        this.bakiye = bakiye;
    }

    public void paraYatir (double miktar) {
        if(miktar <= 0) {
            throw new IllegalArgumentException("yatırılacak miktar pozitif olmalıdır.");

        }

        bakiye += miktar;
        System.out.println(hesapNo + "nolu hesaba " +miktar + " TL para yatırıldı");
        System.out.println("Güncel bakiye: " + bakiye);

    }
    public abstract void paraCek(double miktar);

    public void transfer(Hesap hedefHesap, double miktar) {
        if (hedefHesap ==null) {
            throw new RuntimeException("geçersiz hesap bilgisi");
        }
        //önce para hesaptan çekilir
        this.paraCek(miktar);

        hedefHesap.paraYatir(miktar);

        System.out.println(this.hesapNo + " hesabına " + miktar + " TL transfer edilmiştir.");

    }

    public abstract String hesapTuru();

    public void hesapOzeti() {
        System.out.println("hesap türü: " + hesapTuru() + ", hesap sahibi: " + hesapSahibi + ", hesap no: " + hesapNo + ", bakiye: " + bakiye);
    }

}
