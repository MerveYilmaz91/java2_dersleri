package gun24.soru3;

public class SabitBilgi {

    //puclic olduğu için projenin her klasöründen ulaşılabilir.
    //static olduğu için nesne oluşturmadan Class ismiyle kullanılabilir.
    // final olduğu için değeri değiştirilmez.
    public static final String ulkeKodu = "TR";

    //---------

    // final String ulkeKodu = "TR";    -->  //default olduğu için sadece aynı paket içinden ulaşılabilir.
    // final olduğu için değeri değiştirilmez.
    //static olmadığı için nesne üretip kullanılması gerekir.
    //final String ulkeKodu = "TR";

    //-----------


    // public final String ulkeKodu = "TR";  -->   // public olduğu için projenin her klasöründen ulaşılabilir.
    //final olduğu için değeri değiştirilemez.
    //Static olmadığı için nesne oluşturulması gerekir.

}
