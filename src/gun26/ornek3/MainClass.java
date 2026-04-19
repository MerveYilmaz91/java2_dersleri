package gun26.ornek3;

public class MainClass {
    public static void main (String[] args) {
        /** bir ürün sınıfı oluşturun.
         * ürün sınıfında barkod ve isim alanları olacak.
         * barkod oluşturulduktan sonra değiştirilemesin.
         * isim ise değiştirilebilir.
         **/

        Urun urun = new Urun("TR12345","laptop");

        //barkod değişkeni final olarak tanımlandığı için ilk değer atamasından sonra değeri değiştirilemez.

        System.out.println("barkod: " + urun.getBarkod());
        urun.setIsim("bilgisayar");
        System.out.println("adı: " + urun.getIsim());



    }

}
