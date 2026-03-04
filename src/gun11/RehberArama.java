package gun11;

import java.util.Scanner;

public class RehberArama {
    public static void main(String[] args) {

        /** kullanıcıdan 5 tane isim alalım, bunları rehbere kaydedelim.
         * daha sonra kullanıcı isim girip, rehberde arama yapsın.
         * aradığı isim varsa "rehberde var", yoksa "reberde yok" yazalım.
         **/
        Scanner scanner =new Scanner(System.in);
        String[] isimler = new String[5];
        // for döngüsü ile rehberi oluşturduk
        for (int index = 0; index < isimler.length; index++) {
            System.out.println((index + 1) + ". ci isim: ");
            isimler[index] = scanner.nextLine().trim();

            //boş girdi yapılırsa, rehbere bilinmiyor diye kayıt yapalım.
            if (isimler[index].isEmpty()) {
                isimler[index] = "Bilinmeyen kisi";
            }
        }
        System.out.println("Aramak istediğiniz kişinin adini yazin: ");
        String aranan =  scanner.nextLine().trim();
        boolean varMi = false;

        for (int i = 0; i < isimler.length; i++) {
            if (isimler[i].equalsIgnoreCase(aranan)) {
                varMi = true;
                break;
            }
        }
        if (varMi) {
            System.out.println("rehberde var");
        }else  {
            System.out.println("rehberde yok");
        }
        scanner.close();

    }
}
