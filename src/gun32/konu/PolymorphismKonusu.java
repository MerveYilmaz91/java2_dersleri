package gun32.konu;

import gun32.InterfaceIle.Bildirim;
import gun32.InterfaceIle.EmailBildirim;
import gun32.InterfaceIle.MesajBildirim;

import java.util.ArrayList;
import java.util.List;

public class PolymorphismKonusu {
    /**
     * ınheritance and interface
     * extends -> alt sınıflar üst sınıfta tanımlanan değişken ve metotlara sahip oluyorlar.
     * implements -> sınıflara tanımlanan metotları eklemiş oluyoruz.

     * hayvan -> parent  , void sesCikar()
     * kedi -> child  , @override void sesCikar()  - > kendisine göre yeniden yazdık.
     * köpek -> child  , @override void sesCikar()  - > kendisine göre yeniden yazdık.

     * Hayvan kedi= new kedi();
     * Hayvan kopek = new kopek();
     *

     **/

    public static void main (String[] args) {
        Hayvan kedi = new Kedi() ;
        Hayvan kopek = new Kopek() ;

        List<Hayvan> hayvanlar = new ArrayList<>();

        hayvanlar.add(new Kedi());
        hayvanlar.add(new Kopek());
        hayvanlar.add(new Kopek());
        hayvanlar.add(new Kedi());

        kedi.sesCikar();
        kopek.sesCikar();
        System.out.println();

        for (Hayvan hayvan : hayvanlar) {
            hayvan.sesCikar();
        }

        Bildirim bildirim1 = new EmailBildirim();
        Bildirim bildirim2 = new MesajBildirim();

        bildirim1.gonder();
        bildirim2.gonder();
    }




}
