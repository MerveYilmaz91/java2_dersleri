package gun24.soru2;

public class mainClass {
    public static void main(String[] args) {
        /**
         * bir hesaplama sınıfı oluşturun.
         * kupAl() adında static bir metod yazın.
         * bu metod şu işi yapsın: giilen sayının küpünü bulsun.
         * nesne oluşturmadan bu metodu çağırıp kullanın.
         **/

        int sonuc = Hesaplama.kupAl(4);
        System.out.println("sonuç: " + sonuc);

        System.out.println("(JAVA)4 ve 5 den büyük olan : " + Math.max(4,5));
        System.out.println("(BIZIMKİ)4 ve 5 den büyük olan : " + Hesaplama.max(4,5));

        System.out.println("(JAVA)4 ve 5 den küçük olan : " + Math.min(4,5));
        System.out.println("(BIZIMKİ)4 ve 5 den küçük olan : " + Hesaplama.min(4,5));
    }
}
