package _28_02_2026_Practice;

import java.util.Scanner;

public class ornek2 {
    public static void main(String[] args) {
        /**
         * Kullanıcının yaşına göre uygun bir selamlaşma mesajı veren java programı
         * 18 yaşından küçükler: "merhaba genç arkadaşım"
         * 18-65 yaş arası: "merhaba saygıdeger dostum"
         * 65 yaş üstü : "merhaba kıymetli büyüğüm"
         **/

        Scanner readInt = new Scanner(System.in);
        System.out.println("Lutfen yasinizi girin: ");
        int girilenYas = readInt.nextInt();

        String mesaj;
        if(girilenYas<18){
            mesaj = "Merhaba genc arkadasım";

        }else if(girilenYas < 65) {
            mesaj = "Merhaba saygıdeger dostum";

        }else {
            mesaj = "Merhaba kıymetli buyugum";
        }
        System.out.println(mesaj);

    }
}
