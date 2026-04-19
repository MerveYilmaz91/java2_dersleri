package gun23.soru4;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        /**
         * kullanıcıdan 3 tane kitap bilgisi alın
         * kitap sayfa sayısı 200 den fazla olanları ekrana yazdırın.
         * kitapların yazarlarını ayrıca yazdırın.
         **/

        Scanner scanner = new Scanner(System.in);
        Kitap[] kitap = new Kitap[3];
        // new Kitap[3] dememizin sebebi 3 tane index oluştursun.
        // eğer bu indexler için nesne oluşturmazsam
        //başlangıç default değeri null olur.
        //kitap [0] => null çünkü içerisinde nesne yok
        //kitap [1] => çünkü içerisinde nesne yok
        //kitap kitap = new kitap();

        //5 kitabın bilgilerini kullanıcıdan aldık.
        for (int index = 0; index < kitap.length; index++) {
            //arra içerisindeki her bir eleman bir kitaptır. bu yüzden önce o kitaptan bir nesne üretmek gerekir.
            kitap[index] = new Kitap();
            System.out.println((index + 1) + ". kitap ismi: ");
            kitap[index].adi = scanner.nextLine().trim();

            System.out.println((index + 1) + ". kitap yazari: ");
            kitap[index].yazar = scanner.nextLine().trim();

            System.out.println((index + 1) + ". kitap sayfa sayisi: ");
            kitap[index].sayfaSayisi = scanner.nextInt();
            scanner.nextLine();

        }
        //sayfa sayısı 200 den büyük olanların ismi:
        for (int i=0; i<kitap.length; i++) {
            if (kitap[i].sayfaSayisi > 200) {
                System.out.println("sayfa sayısı 200 den büyük " + kitap[i].adi);
            }
        }
        for (int i=0; i<kitap.length; i++) {
            System.out.println(kitap[i].yazar);
        }
    }
}
