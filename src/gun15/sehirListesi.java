package gun15;

import java.util.ArrayList;
import java.util.Scanner;

public class sehirListesi {
    public static void main(String[] args) {
        /** kullanıcıdan kaç tane şehir ismi gireceğini alın.
         * sonra kullanıcıdan silmek istediği sehir ismini alın.
         * eger bu isim liste içerisinde varsa listeden silin. silindi yazdırın
         * yoksa şehir bulunamadı yazdırın.
         **/

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> sehirler = new ArrayList<>();
        System.out.println("kaç şehir ismi gireceksiniz?");
        int miktar = scanner.nextInt();
        scanner.nextLine();

        for (int index = 0; index < miktar; index++) {
            while (true) {
                System.out.println((index + 1) + ". isim");
                String isim = scanner.nextLine().trim();

                if (isim.isEmpty()) {
                    System.out.println("şehir ismi boş olamaz.");
                } else {
                    sehirler.add(isim);
                    break;
                }
            }
        }

        System.out.println("silmek istediğiniz şehir ismi: ");
        String silinecek = scanner.nextLine().trim();

        int index= -1;
        for (int i = 0; i < sehirler.size(); i++) {
            if (silinecek.equalsIgnoreCase(sehirler.get(i))) {
                index = i;
                    break;
                }
            }
            if (index == -1) {
                System.out.println("aranan şehir bulunamadı");
            }else  {
                sehirler.remove(index);
                System.out.println("sehir silindi");
                System.out.println("geri kalan şehirler:");
                System.out.println(sehirler);
            }
        }
    }

