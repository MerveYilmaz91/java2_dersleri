package gun7;

import java.util.Scanner;

public class KullaniciAdiUretme {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String fullName;
        do {
            System.out.print("Ad Soyad: ");
            fullName=scanner.next().trim();

            if (!fullName.contains(" ")) {
                System.out.println("Ad Soyad arasinda bosluk birakin");
            }
        } while (!fullName.contains(" "));
        int index = fullName.indexOf(" ");
       String firstName = fullName.substring(0, index);
       String lastName = fullName.substring(index + 1);

       String username = firstName.substring(0,1) + lastName.toLowerCase();
        // String username = firstName.substring(0,1).concat(lastName) . toLowerCase();
       System.out.println("kullanıcı adı" + username);

    }
}
