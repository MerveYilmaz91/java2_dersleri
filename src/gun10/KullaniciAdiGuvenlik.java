package gun10;

import java.util.Scanner;

public class KullaniciAdiGuvenlik {
    public static void main(String[] args) {
        /**
         * kullanıcıdan bir kullanıcı adı al
         * baş ve son boşlukları temizle
         * temizledikten sonra boşsa uyarı ver ve bitir.
         * kullanıcı adını tek tek gezip:
         * büyük harf, küçük harf, rakam sayılarını bul ve SAYILARI yazdır.
         * eger en az 1 büyük + 1 küçük + 1 rakam ve
         * uzunluk >= 8 ise "güçlü", değilse "zayıf" yazdır.
         * ilk karaktere göre kategori yazdır: A-E, F-K, L-R, S-Z, Diğer.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kullanici adi girin: ");
        String username = scanner.nextLine().trim();

        if (username.isEmpty()) {
            System.out.println("Kullanici adi bos olamaz");

        } else  {
            // her degisken türü int olduğu için,
            // tek satırda bu şekilde tanımlayabiliriz.
            int upper = 0, lower = 0, digit = 0 ;
            for (int i = 0; i < username.length(); i ++) {
                char ch = username.charAt(i);
                if (ch >= 'A' && ch <= 'Z') {
                    upper++;
                } else if (ch >= 'a' && ch <= 'z') {
                    lower++;
                } else if (ch >= '0' && ch <= '9') {
                    digit++;
                }

            }
            System.out.println("Büyük harf sayisi: " + upper);
            System.out.println("Küçük harf sayisi: " + lower);
            System.out.println("Rakam sayisi: " + digit);

            if (username.length() >= 8
                    && upper >=1
                    && lower >=1 && digit >=1 ) {
                System.out.println("usename güçlü");
            } else {
                System.out.println("username zayif");
                
            }
            
            String group =
                    // kullanıcının ilk harfi büyük girme ihtimaline karşı tüm username i küçükttük
            // çünkü biz küçük harflere göre gruplama yapıoruz burda.
            username = username.toLowerCase();
            char first = username.charAt(0);
            
            if (first >= 'a' && first <= 'e') {
                group = "a-e";
            } else if (first >= 'f' && first <= 'k') {
                group = "f-k";
            } else if (first >= 'l' && first <= 'r') {
                group = "l-r";
            } else if (first >= 's' && first <= 'z') {
                group = "s-z";
            }else {
                group = "Diğer";
            }

            switch (group) {
                case "a-e":
                    System.out.println("Kategori: A-E grubu");
                    break;
                    case "f-k":
                        System.out.println("Kategori: F-K grubu");
                        break;
                        case "l-r":
                            System.out.println("Kategori: L-R grubu");
                            break;
                            case "s-z":
                                System.out.println("Kategori: S-Z grubu");
                                break;
                                case "Diğer":
                                    System.out.println("Kategori: Diğer grubu");
            }

        }


    }
}
