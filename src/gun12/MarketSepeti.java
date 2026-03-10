package gun12;

import java.util.Scanner;

public class MarketSepeti {
    public static void main(String[] args) {
        /** kullanıcıdan 5 ürün adı alın.
         * her ürün adını temizleyip (baş son boşluklar)
         * boş girilmişse tekrar isteyin.
         * en sonda:
         * girilen ürünleri sırayla yazın.
         * içlerinde kaç tanesinde rakam geçtiğini bulun. (örn:"süt2")
         * ürün adlarının ilk harfine göre şu sınıflandırmayı yapıp her ürün için yazdırın:
         * A-E /F-K /L-R /S-Z / DİĞER
         **/

        Scanner scanner = new Scanner(System.in);
        String[] names = new String[5];
        int index = 0;

        while (index < names.length) { //kaç defa döneceğini bilmiyorum
            System.out.print("ürün adı girin: ");
            String name = scanner.nextLine().trim();

            if (name.isEmpty()) {
                System.out.println("ürün adı boş olamaz, tekrar girin");
                continue;
            }

            names[index] = name;
            index++;
        }

            int rakamSayisi = 0;

            //ürünlerin sıra ile ismi

            System.out.println("-----girilen ürünler----");
            for (int i = 0; i < names.length; i++) {
                String n = names[i];
                System.out.println((i + 1) + ". " + n);

                for (int j = 0; j < n.length(); j++) {
                    //names[0] = "armut"; -> length 5
                    //names[1] = "kiwi"; -> length 4
                    char ch = n.charAt(j);

                    if (ch >= '0' && ch <= '9') {    //bu koşul true ise
                        rakamSayisi++;          // ürün ismi içerisinde rakam var demektir.
                    }
                }
                System.out.println("ürünler içerisinde geçen rakam sayisi: " + rakamSayisi);
            }
        }


    }
