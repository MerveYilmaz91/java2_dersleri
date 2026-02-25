package _21_02_2026_.Degiskenler;

import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);

        System.out.print("Lütfen adınızı girin: ");  //Println olsaydı ASYA YILMAZI AŞAĞI YAZACAKTI
        String girilenAdi=oku.nextLine();   // oku.next te ilk ismi alıyor. nextLine da iki ismide alıyor.
        System.out.println("Merhaba " + girilenAdi +"!");
    }
}
