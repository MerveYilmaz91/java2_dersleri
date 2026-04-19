package gun28.ornek2;

public class MainClass {
    public static void main (String[] args) {
        Kedi kedi = new Kedi(true,"tekir");
        Kopek kopek = new Kopek(false,"karabas");

        System.out.println("kedi adı: " + kedi.ad);
        System.out.println("kedi yaşıyor mu: " + kedi.yasiyorMu);
        kedi.sesCikar();

        System.out.println("köpek adı:" + kopek.ad);
        System.out.println("kopek yaşıyor mu: " + kopek.yasiyorMu);
        kopek.sesCikar();



    }
}
