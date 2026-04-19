package gun28.ornek2;

public class Kedi extends Hayvan {
    public Kedi(boolean yasiyorMu,String ad) {
        super(yasiyorMu, ad);

        /**
         * super: parent class anlamında kullanılır.
         * super: public hayvan (String ad) {
         * this.ad = ad
         */
    }

    @Override
    public void sesCikar() {
        System.out.println("kedi miyavlar");
        System.out.println();

    }
}
