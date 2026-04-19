package gun24.soru3;

public class mainClass {
    public static void main(String[] args) {
        /**
         * bir SabirBilgi isminde bir class oluşturun.
         * ulkeKodu adından bir değişken tanımlayın. ve buna bir değer atayın.
         * atanan bu değer sonradan değiştirilmesin.
         **/

        System.out.println("SabitBilgi" + SabitBilgi.ulkeKodu);

        SabitBilgi sabitBilgi = new SabitBilgi();
        //sabitBilgi.ulkeKodu -> ulkeKodu static olduğu için class a ait bir değişkendir.
        //nesne bunu kullanamaz.
    }
}
