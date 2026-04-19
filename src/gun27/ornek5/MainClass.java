package gun27.ornek5;

public class MainClass {
    public static void main (String[] args) {
        /**
         * bir kütüphane üyesinin adı ve ödünç aldığı kitap sayısı tutuluyor.
         * bir üye aynı anda en fazla 3 kitap alabilsin.
         * kitap sayısı dışarıdan doğrudan değiştirilmesin.
         * sadece kitap alma ve kitap iade etme işlemleri ile güncellensin.
         **/

        Uye uye=new Uye("MERVE",1);
        uye.kitapAl();
        uye.bilgileriGoster();

        uye.kitapAl();

        uye.kitapAl();
        uye.bilgileriGoster();




    }
}
