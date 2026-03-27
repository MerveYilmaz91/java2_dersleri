package gun15;

import java.util.ArrayList;
import java.util.Scanner;

public class AlisverisSepeti {
    public static void main(String[] args) {
        /**
         * Kullanıcı ürün isimlerini tek tek girecek
         * kullanıcı bitti yazana kadar devam edecek.
         * en son :
         * sepetteki ürünleri sıra numarası ile yazdırıcaz.
         * kullanıcının girdiği ürünün adını aratıcaz.
         * varsa kaçıncı sırada olduğunu yazdırın.
         * yoksa bulunamadı yazdırın.
         **/

        Scanner scanner = new Scanner(System.in);

        ArrayList <String> isimler = new ArrayList();

        // bu da ikinci çözüm yolu. kullanıcı ilk girişte bitti yazabilir diye do/while kullandık.
        /**

        String isim;
        do {
            System.out.println("ürün ismi: ");
            isim = scanner.nextLine().trim();
            if (!isim.equalsIgnoreCase("bitti")) {
                isimler.add(isim);
            }
        } while (!isim.equalsIgnoreCase("bitti"));
         **/

        System.out.println("ürün ismi girin. girdiyi bitirmek için bitti yazın.");

        while (true) {
            System.out.println("ürün ismi: ");
            String name = scanner.nextLine().trim();

            if (name.equalsIgnoreCase("bitti")) {
                break;
            }
            if (name.isEmpty()) {
                System.out.println("ürün ismi boş olamaz.");
                continue;
            }
            isimler.add(name);
        }

        for (int index = 0; index < isimler.size(); index++) {
            System.out.println((index + 1) + "ürün ismi -> " + isimler.get(index));
        }

        System.out.println("aramak istediğiniz ürün adını girin: ");
        String aranan =  scanner.nextLine().trim();

        //boolean değişken ataması yaparken default olarak false değeri atanır.
        //işlem doğru çıkarsa değişken true yapılır.
        //integer değerlerde ise default değer -1 yapılır.
        //işlem sonucu int değişkene atanır.
        //index değerleri 0 dan başladığı için bu şekilde kullanılır.

        boolean varMi = false;
        int bulunduguIndex = -1;  // bu kullanıma flag denir. bu sayede işlemler yapılır sonuç bir değişkene kaydedilir.
        // sonrasında bu değişken kullanılabilir.

        for (int index = 0; index < isimler.size(); index++) {

            if (aranan.equalsIgnoreCase(isimler.get(index))) {
                bulunduguIndex = index;
                break;  // aradığım liste içerisinde gezmesine gerek yok.
            }
        }
        if (bulunduguIndex == -1) {
            System.out.println("ürün bulunamadı");
        } else {
            System.out.println("ürün bulundu. sırası -> " + (bulunduguIndex + 1));
        }

    }
}
