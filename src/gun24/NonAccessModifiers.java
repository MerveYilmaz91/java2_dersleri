package gun24;

public class NonAccessModifiers {
    public static void main(String[] args) {

        /**
         * Non access modifiers :
         * 1- static : bir metodu static yaparsak o metodu nesne oluşturmadan class ismi ile kullanabiliriz.
         * bir değişkeni static yaparsak o class dan oluşturulan tüm nesneler için bu değişken ortak olur.
         *
         * 2- final : değişmezlik veya sınır koyma olarak tanımlanabilir.
         * degeri belli olan ve sonradan değiştirilmesin istediğim değişkenleri final ile tanımlarız.
         * mesela matematikteki pi sayısı.
         *
         * 3- abstact :
         **/


        System.out.println("kare alanı: " + GeometriHesapla.kare(5));
        System.out.println("dikdörtgenin alanı: " + GeometriHesapla.dikdörtgen(4,6));





    }
}
