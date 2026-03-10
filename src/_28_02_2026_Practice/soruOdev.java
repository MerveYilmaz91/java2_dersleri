package _28_02_2026_Practice;

import java.util.Scanner;

public class soruOdev {
    public static void main(String[] args) {
        /**
         * bir kişinin yaşına göre sinema biletini fiyatını hesaplayan bir java programı yazın.
         * sinema bilet fiyatı 60 tl dir.
         * yaşa göre aşağıdaki indirimler uygulanmaktadır.
         * 18 yaşından küçükler:12 TL indirim ->60-12
         * 18-60 yaş:6 TL 60-6
         * 60 yaşından büyükler: 9 TL indirim. 60-9
         * kullanıcıdan yaş bilgisini alarak indirimli bilet fiyatını ekrana yazdırın.
         **/

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Yaşınızı girin: ");
        int girilenYas =  input.nextInt();

        int fiyat = 60;
        int indirim =0;
        int odenecek;

        if (girilenYas <18) {
            indirim = 12;
        }else if (girilenYas <=60) {
            indirim = 6;
        }else {
            indirim = 9;
        }
         odenecek = fiyat-indirim;
        System.out.println("indirim: " + indirim + "TL");
        System.out.println("odenecek: " + odenecek + "TL");

    }
}
