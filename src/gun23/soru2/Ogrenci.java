package gun23.soru2;

public class Ogrenci {
    String ad;
    int numara;
    double ortalama;

    void bilgiYaz() {
        System.out.println("ad: " + ad);
        System.out.println("numara: " + numara);
        System.out.println("ortalama: " + ortalama);

    }

    void sinavDurumu() {
        if (ortalama >= 50) {
            System.out.println("sınavı geçti");
        }else {
            System.out.println("sınavdan kaldı");
        }
    }


}
