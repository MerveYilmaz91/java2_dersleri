package gun25.ornek1;

public class Kitap {
    public String ad;

    /**
     * public Kitap() : bu java nın default olarak tanımladığı bir constructor.
     **/
    // eğer ki parametreli bir constructor yazıyorsak
    //bu class tan nesne üretirken Kitap kitap = new Kitap()
    // şeklinde artık kullanamayız (bos constructor)
    // eğer ki bos constructor lazım ise ayriyeten tanımlamak gerekir.
    public Kitap(String ad) {
        this.ad = ad;  // this : bu class a ait demek, parametre ismi ile class field lerinin isimleri aynı olduğunda
        // karışıklık olabilir. bunun için class fieldleri önüne this yazıp kullanıyoruz.
}
public Kitap() {

}
}
