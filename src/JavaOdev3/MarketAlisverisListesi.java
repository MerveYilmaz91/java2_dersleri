package JavaOdev3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MarketAlisverisListesi {
    public static void main(String[] args) {
        /**
         * Bir kullanıcı marketten alacağı ürünleri giriyor. Bazı ürünler tekrar girilmiş olabilir.
         * Girilen tüm ürünleri saklayınız.
         * Tekrar eden ürünleri ayıklayınız.
         * Son durumda listedeki ürünleri ekrana yazdırınız.
         **/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Alacağınız ürünleri girin: ");

        String urunler = scanner.nextLine();

        String [] urunArray = urunler.split(" ");  //ürünleri ayırdım

        ArrayList<String> tumUrunler = new ArrayList<>();  //ürünleri listeye attım

        for (String urun : urunArray) {
            tumUrunler.add(urun);
        }
        Set<String> benzersizUrunler = new HashSet<>(tumUrunler); //tekrar edenleri kaldırdım

        System.out.println("tüm ürünler: " + tumUrunler);
        System.out.println("tekrar etmeyen ürünler : " + benzersizUrunler);
    }
}
