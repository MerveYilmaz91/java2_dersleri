package gun7;

import java.util.Scanner;

public class YasKontrolu {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        String username;
        while (true) {
            System.out.println("Kullanıcı ismi girin:");
            username = scanner.next().trim();
            if (username.length() < 3) {
                System.out.println("hatali giris yapıldı");
            } else {
                break;  // kullanıcı dogru giriş yapmış demektir.
            }
        }
        System.out.print("Yasınızı girin: ");
        int yas = scanner.nextInt();
        if (yas < 18) {
            System.out.println(username + " -> izleyemez");
        }else {
            System.out.println(username + " -> izleyebilir");
        }



    }
}
